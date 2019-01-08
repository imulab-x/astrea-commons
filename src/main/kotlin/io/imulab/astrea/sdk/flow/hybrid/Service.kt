package io.imulab.astrea.sdk.flow.hybrid

import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.grpc.Channel
import io.imulab.astrea.sdk.commons.flow.hybrid.*
import io.imulab.astrea.sdk.commons.toOAuthException
import io.imulab.astrea.sdk.flow.code.AuthorizeCodeFlowTokenLegService
import io.imulab.astrea.sdk.oauth.error.TemporarilyUnavailable
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oidc.request.OidcAuthorizeRequest
import io.imulab.astrea.sdk.oidc.response.OidcAuthorizeEndpointResponse
import io.imulab.astrea.sdk.oidc.response.OidcTokenEndpointResponse
import io.vavr.control.Try
import org.slf4j.LoggerFactory
import java.time.Duration

/**
 * Service interface for the authorization part of the hybrid flow.
 */
interface HybridFlowCodeLegService {
    suspend fun authorize(request: OidcAuthorizeRequest): OidcAuthorizeEndpointResponse
}

/**
 * Service interface for the authorization part of the hybrid flow.
 */
interface HybridFlowTokenLegService {
    suspend fun exchange(request: OAuthAccessRequest): OidcTokenEndpointResponse
}

/**
 * Client side implementation of [HybridFlowCodeLegService]. This implementation uses gRPC calls
 * to the remote service to fulfill the request. The call is protected by a circuit breaker, which will
 * return temporarily_unavailable if call is not successful. Business logic error is wrapped in normal
 * response so any call error is regarded as service level error.
 */
class RemoteHybridFlowCodeLegService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build()
) : HybridFlowCodeLegService {

    private val logger = LoggerFactory.getLogger(RemoteHybridFlowCodeLegService::class.java)

    private val stub = HybridFlowServiceGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<HybridCodeRequest, HybridCodeResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req -> stub.authorize(req) }

    override suspend fun authorize(request: OidcAuthorizeRequest): OidcAuthorizeEndpointResponse {
        val result: Try<HybridCodeResponse> = Try.of { op.apply(request.toHybridCodeRequest()) }
        if (result.isFailure)
            logger.error("Hybrid flow request ${request.id} encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()
        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Hybrid flow request ${request.id} was successful.")
        return response.toOidcAuthorizeEndpointResponse()
    }
}

/**
 * Client side implementation of [AuthorizeCodeFlowTokenLegService]. This implementation uses gRPC calls
 * to the remote service to fulfill the request. The call is protected by a circuit breaker, which will
 * return temporarily_unavailable if call is not successful. Business logic error is wrapped in normal
 * response so any call error is regarded as service level error.
 */
class RemoteHybridFlowTokenLegService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build()
) : HybridFlowTokenLegService {

    private val logger = LoggerFactory.getLogger(RemoteHybridFlowTokenLegService::class.java)

    private val stub = HybridFlowServiceGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<HybridTokenRequest, HybridTokenResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req -> stub.exchange(req) }

    override suspend fun exchange(request: OAuthAccessRequest): OidcTokenEndpointResponse {
        val result: Try<HybridTokenResponse> = Try.of { op.apply(request.toHybridTokenRequest()) }
        if (result.isFailure)
            logger.error("Hybrid flow exchange ${request.id} encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()
        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Hybrid flow exchange ${request.id} was successful.")
        return response.toOidcTokenEndpointResponse()
    }
}