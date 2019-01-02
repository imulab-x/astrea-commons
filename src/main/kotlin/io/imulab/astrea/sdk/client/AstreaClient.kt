package io.imulab.astrea.sdk.client

import io.imulab.astrea.sdk.oidc.client.OidcClient
import java.time.LocalDateTime

/**
 * A client that is used in the Astrea world.
 */
interface AstreaClient : OidcClient {

    /**
     * When the client is created.
     */
    val creationTime: LocalDateTime

    /**
     * When the client is updated.
     */
    val lastUpdateTime: LocalDateTime

    /**
     * Request objects keyed by corresponding request uri.
     */
    val requests: Map<String, String>
}