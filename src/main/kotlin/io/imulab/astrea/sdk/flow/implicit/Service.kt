package io.imulab.astrea.sdk.flow.implicit

import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.grpc.Channel
import io.imulab.astrea.sdk.commons.flow.code.AuthorizeCodeFlowServiceGrpc
import io.imulab.astrea.sdk.commons.flow.code.TokenRequest
import io.imulab.astrea.sdk.commons.flow.code.TokenResponse
import io.imulab.astrea.sdk.commons.flow.implicit.ImplicitFlowServiceGrpc
import io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest
import io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse
import io.imulab.astrea.sdk.commons.toOAuthException
import io.imulab.astrea.sdk.flow.code.AuthorizeCodeFlowTokenLegService
import io.imulab.astrea.sdk.flow.code.toOidcTokenEndpointResponse
import io.imulab.astrea.sdk.flow.code.toTokenRequest
import io.imulab.astrea.sdk.oauth.error.TemporarilyUnavailable
import io.imulab.astrea.sdk.oidc.request.OidcAuthorizeRequest
import io.imulab.astrea.sdk.oidc.response.OidcAuthorizeEndpointResponse
import io.vavr.control.Try
import org.slf4j.LoggerFactory
import java.time.Duration

/**
 * Service interface for implicit flow.
 */
interface ImplicitFlowService {
    suspend fun authorize(request: OidcAuthorizeRequest) : OidcAuthorizeEndpointResponse
}

/**
 * Client side implementation of [ImplicitFlowService]. This implementation uses gRPC calls
 * to the remote service to fulfill the request. The call is protected by a circuit breaker, which will
 * return temporarily_unavailable if call is not successful. Business logic error is wrapped in normal
 * response so any call error is regarded as service level error.
 */
class RemoteImplicitFlowService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build()
) : ImplicitFlowService {

    private val logger = LoggerFactory.getLogger(RemoteImplicitFlowService::class.java)

    private val stub = ImplicitFlowServiceGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<ImplicitTokenRequest, ImplicitTokenResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req -> stub.authorize(req) }

    override suspend fun authorize(request: OidcAuthorizeRequest): OidcAuthorizeEndpointResponse {
        val result: Try<ImplicitTokenResponse> = Try.of { op.apply(request.toImplicitTokenRequest()) }
        if (result.isFailure)
            logger.error("Implicit token exchange ${request.id} encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()
        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Implicit token exchange ${request.id} was successful.")
        return response.toOidcAuthorizeEndpointResponse()
    }
}