package io.imulab.astrea.sdk.flow.cc

import io.imulab.astrea.sdk.client.VoidClient
import io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest

class ClientCredentialsClient(source: ClientCredentialsTokenRequest.Client) : VoidClient() {
    override val id: String = source.id
    override val type: String = source.type
    override val scopes: Set<String> = source.scopesList.toSet()
    override val grantTypes: Set<String> = source.grantTypesList.toSet()
}