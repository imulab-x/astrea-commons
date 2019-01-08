package io.imulab.astrea.sdk.flow.refresh

import io.imulab.astrea.sdk.client.VoidClient
import io.imulab.astrea.sdk.commons.flow.refresh.RefreshRequest
import io.imulab.astrea.sdk.oauth.token.JwtSigningAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.JweContentEncodingAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.JweKeyManagementAlgorithm

class RefreshClient(source: RefreshRequest.Client) : VoidClient() {
    override val id: String = source.id
    override val grantTypes: Set<String> = source.grantTypesList.toSet()
    override val jwks: String = source.jwks
    override val jwksUri: String = ""
    override val idTokenEncryptedResponseAlgorithm: JweKeyManagementAlgorithm =
        JweKeyManagementAlgorithm.fromSpec(source.idTokenEncryptedResponseAlgorithm)
    override val idTokenEncryptedResponseEncoding: JweContentEncodingAlgorithm =
        JweContentEncodingAlgorithm.fromSpec(source.idTokenEncryptedResponseEncoding)
    override val idTokenSignedResponseAlgorithm: JwtSigningAlgorithm =
        JwtSigningAlgorithm.fromSpec(source.idTokenSignedResponseAlgorithm)
}