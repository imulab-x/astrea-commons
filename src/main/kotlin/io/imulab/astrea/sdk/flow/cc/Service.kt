package io.imulab.astrea.sdk.flow.cc

import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.grpc.Channel
import io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsFlowServiceGrpc
import io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest
import io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse
import io.imulab.astrea.sdk.commons.toOAuthException
import io.imulab.astrea.sdk.oauth.error.TemporarilyUnavailable
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oauth.response.TokenEndpointResponse
import io.vavr.control.Try
import org.slf4j.LoggerFactory
import java.time.Duration

/**
 * Service interface for client credentials flow.
 */
interface ClientCredentialsFlowService {
    suspend fun exchange(request: OAuthAccessRequest): TokenEndpointResponse
}

/**
 * Client side implementation of [ClientCredentialsFlowService]. This implementation uses gRPC calls
 * to the remote service to fulfill the request. The call is protected by a circuit breaker, which will
 * return temporarily_unavailable if call is not successful. Business logic error is wrapped in normal
 * response so any call error is regarded as service level error.
 */
class RemoteClientCredentialsFlowService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build()
) : ClientCredentialsFlowService {

    private val logger = LoggerFactory.getLogger(RemoteClientCredentialsFlowService::class.java)

    private val stub = ClientCredentialsFlowServiceGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<ClientCredentialsTokenRequest, ClientCredentialsTokenResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req -> stub.exchange(req) }

    override suspend fun exchange(request: OAuthAccessRequest): TokenEndpointResponse {
        val result: Try<ClientCredentialsTokenResponse> = Try.of { op.apply(request.toClientCredentialsTokenRequest()) }
        if (result.isFailure)
            logger.error("Client credentials exchange request ${request.id} encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()
        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Client credentials exchange ${request.id} was successful.")
        return response.toTokenEndpointResponse()
    }
}