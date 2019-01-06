package io.imulab.astrea.sdk.event

import io.imulab.astrea.sdk.oidc.client.OidcClient

object ClientEvents {

    const val createClientEvent = "client.created"
    const val updateClientEvent = "client.updated"
    const val deleteClientEvent = "client.deleted"

    val clientCreated: (OidcClient) -> Map<String, Any> = { client ->
        mapOf("id" to client.id)
    }

    val clientUpdated: (OidcClient) -> Map<String, Any> = { client ->
        mapOf("id" to client.id)
    }

    val clientDeleted: (OidcClient) -> Map<String, Any> = { client ->
        mapOf("id" to client.id)
    }
}