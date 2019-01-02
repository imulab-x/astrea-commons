package io.imulab.astrea.sdk.client

import com.github.benmanes.caffeine.cache.Cache
import com.github.benmanes.caffeine.cache.Caffeine
import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.grpc.Channel
import io.imulab.astrea.sdk.commons.client.ClientLookupGrpc
import io.imulab.astrea.sdk.commons.client.ClientLookupRequest
import io.imulab.astrea.sdk.commons.client.ClientLookupResponse
import io.imulab.astrea.sdk.commons.toOAuthException
import io.imulab.astrea.sdk.oauth.client.ClientLookup
import io.imulab.astrea.sdk.oauth.client.OAuthClient
import io.imulab.astrea.sdk.oauth.error.TemporarilyUnavailable
import io.vavr.control.Try
import org.slf4j.LoggerFactory
import java.time.Duration

/**
 * Client side implementation of [ClientLookup]. This implementation first consults a local cache for any
 * cached instances. If not found, it then consults the remote gRPC service. The remote call is protected
 * by a circuit breaker. In case the remote service is down, it will directly throw temporarily_unavailable
 * error.
 */
class RemoteClientLookupService(
    channel: Channel,
    circuitBreakerConfig: CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .ringBufferSizeInHalfOpenState(2)
        .ringBufferSizeInClosedState(2)
        .waitDurationInOpenState(Duration.ofMillis(1000))
        .build(),
    private val cache: Cache<String, OAuthClient> = Caffeine.newBuilder()
        .maximumSize(10000)
        .build<String, OAuthClient>()
) : ClientLookup {

    private val logger = LoggerFactory.getLogger(RemoteClientLookupService::class.java)

    private val stub = ClientLookupGrpc.newBlockingStub(channel)
    private val op = CircuitBreaker.decorateCheckedFunction<ClientLookupRequest, ClientLookupResponse>(
        CircuitBreaker.of(this::class.java.simpleName, circuitBreakerConfig)
    ) { req ->
        stub.find(req)
    }

    override suspend fun find(identifier: String): OAuthClient {
        val request = ClientLookupRequest.newBuilder()
            .setId(identifier)
            .build()

        val cacheHit = cache.getIfPresent(identifier)
        if (cacheHit != null) {
            logger.info("Loaded client $identifier from cache.")
            return cacheHit
        }

        val result: Try<ClientLookupResponse> = Try.of { op.apply(request) }
        if (result.isFailure)
            logger.error("Client lookup for $identifier encountered error.", result.cause)

        val response = result.get() ?: throw TemporarilyUnavailable.offline()

        if (!response.success)
            throw response.failure!!.toOAuthException()

        logger.debug("Client lookup found client $identifier.")
        return response.toDefaultClient().also { cache.put(identifier, it) }
    }
}