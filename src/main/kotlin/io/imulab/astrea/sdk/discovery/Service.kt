package io.imulab.astrea.sdk.discovery

import io.github.resilience4j.retry.Retry
import io.github.resilience4j.retry.RetryConfig
import io.grpc.Channel
import io.imulab.astrea.sdk.commons.discovery.DiscoveryGrpc
import io.imulab.astrea.sdk.commons.discovery.DiscoveryRequest
import io.imulab.astrea.sdk.oauth.error.TemporarilyUnavailable
import io.imulab.astrea.sdk.oidc.discovery.Discovery
import io.vavr.control.Try
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.runBlocking
import java.time.Duration

/**
 * Service interface for discovery service.
 */
interface DiscoveryService {
    suspend fun getDiscovery(): Discovery
}

/**
 * Client side implementation for [DiscoveryService]. This implementation is mainly designed to be used on
 * service startup to fetch discovery configuration from the discovery service. Due to service startup order,
 * the discovery service may not be available immediately for consumption. Hence, to prevent service startup
 * failure when the discovery service is not yet available, this implementation uses retry logic when discovery
 * fetch is unsuccessful. By default, it retries for 5 times with 10 seconds interval between retries.
 */
class RemoteDiscoveryService(
    channel: Channel,
    private val scope: CoroutineScope = GlobalScope,
    retry: Retry = Retry.of("discovery", RetryConfig.Builder()
        .maxAttempts(5)
        .waitDuration(Duration.ofSeconds(10))
        .retryExceptions(Exception::class.java)
        .build()
    )
): DiscoveryService {

    private val stub = DiscoveryGrpc.newBlockingStub(channel)
    private val getDiscovery = Retry.decorateSupplier(retry) {
        runBlocking(scope.coroutineContext) {
            stub.get(DiscoveryRequest.getDefaultInstance()).toDiscovery()
        }
    }

    override suspend fun getDiscovery(): Discovery {
        return Try.ofSupplier(getDiscovery).getOrElse {
            throw TemporarilyUnavailable.offlineWithName("Discovery service")
        }
    }
}