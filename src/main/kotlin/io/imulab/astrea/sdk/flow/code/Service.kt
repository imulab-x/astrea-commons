package io.imulab.astrea.sdk.flow.code

import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.grpc.Channel
import io.imulab.astrea.sdk.commons.flow.code.*
import io.imulab.astrea.sdk.commons.toOAuthException
import io.imulab.astrea.sdk.oauth.error.TemporarilyUnavailable
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oauth.response.AuthorizeEndpointResponse
import io.imulab.astrea.sdk.oidc.request.OidcAuthorizeRequest
import io.imulab.astrea.sdk.oidc.response.OidcTokenEndpointResponse
import io.vavr.control.Try
import org.slf4j.LoggerFactory
import java.time.Duration

/**
 * Service interface for the authorization part of the authorization code flow.
 */
interface AuthorizeCodeFlowCodeLegService {
    suspend fun authorize(request: OidcAuthorizeRequest): AuthorizeEndpointResponse
}

/**
 * Client side implementation of [AuthorizeCodeFlowCodeLegService]. This implementation uses gRPC calls
 * to the remote service to fulfill the request. The call is protected by a circuit breaker, which will
 * return temporarily_unavailable if call is not successful. Business logic error is wrapped in normal
 * response so any call error is regarded as service level error.
 */
class RemoteAuthorizeCodeFlowCodeLegService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build()
) : AuthorizeCodeFlowCodeLegService {

    private val logger = LoggerFactory.getLogger(AuthorizeCodeFlowCodeLegService::class.java)

    private val stub = AuthorizeCodeFlowServiceGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<CodeRequest, CodeResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req -> stub.authorize(req) }

    override suspend fun authorize(request: OidcAuthorizeRequest): AuthorizeEndpointResponse {
        val result: Try<CodeResponse> = Try.of { op.apply(request.toCodeRequest()) }
        if (result.isFailure)
            logger.error("Authorize code request ${request.id} encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()
        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Authorize code request ${request.id} was successful.")
        return response.toAuthorizeEndpointResponse()
    }
}

/**
 * Service interface for the token part of the authorization code flow.
 */
interface AuthorizeCodeFlowTokenLegService {
    suspend fun exchange(request: OAuthAccessRequest): OidcTokenEndpointResponse
}

/**
 * Client side implementation of [AuthorizeCodeFlowTokenLegService]. This implementation uses gRPC calls
 * to the remote service to fulfill the request. The call is protected by a circuit breaker, which will
 * return temporarily_unavailable if call is not successful. Business logic error is wrapped in normal
 * response so any call error is regarded as service level error.
 */
class RemoteAuthorizeCodeFlowTokenLegService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build()
) : AuthorizeCodeFlowTokenLegService {

    private val logger = LoggerFactory.getLogger(AuthorizeCodeFlowTokenLegService::class.java)

    private val stub = AuthorizeCodeFlowServiceGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<TokenRequest, TokenResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req -> stub.exchange(req) }

    override suspend fun exchange(request: OAuthAccessRequest): OidcTokenEndpointResponse {
        val result: Try<TokenResponse> = Try.of { op.apply(request.toTokenRequest()) }
        if (result.isFailure)
            logger.error("Authorize code exchange ${request.id} encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()
        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Authorize code exchange ${request.id} was successful.")
        return response.toOidcTokenEndpointResponse()
    }
}