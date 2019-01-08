package io.imulab.astrea.sdk.flow.refresh

import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.grpc.Channel
import io.imulab.astrea.sdk.commons.flow.refresh.RefreshFlowServiceGrpc
import io.imulab.astrea.sdk.commons.flow.refresh.RefreshRequest
import io.imulab.astrea.sdk.commons.flow.refresh.RefreshResponse
import io.imulab.astrea.sdk.commons.toOAuthException
import io.imulab.astrea.sdk.oauth.error.TemporarilyUnavailable
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oidc.response.OidcTokenEndpointResponse
import io.vavr.control.Try
import org.slf4j.LoggerFactory
import java.time.Duration

/**
 * Service interface for refresh flow.
 */
interface RefreshFlowService {
    suspend fun exchange(request: OAuthAccessRequest) : OidcTokenEndpointResponse
}

/**
 * Client side implementation of [RefreshFlowService]. This implementation uses gRPC calls
 * to the remote service to fulfill the request. The call is protected by a circuit breaker, which will
 * return temporarily_unavailable if call is not successful. Business logic error is wrapped in normal
 * response so any call error is regarded as service level error.
 */
class RemoteRefreshFlowService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build()
) : RefreshFlowService {

    private val logger = LoggerFactory.getLogger(RefreshFlowService::class.java)

    private val stub = RefreshFlowServiceGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<RefreshRequest, RefreshResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req -> stub.exchange(req) }

    override suspend fun exchange(request: OAuthAccessRequest): OidcTokenEndpointResponse {
        val result: Try<RefreshResponse> = Try.of { op.apply(request.toRefreshRequest()) }
        if (result.isFailure)
            logger.error("Refresh token exchange request ${request.id} encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()
        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Refresh token exchange ${request.id} was successful.")
        return response.toOidcTokenEndpointResponse()
    }
}