package io.imulab.astrea.sdk.flow.implicit

import io.imulab.astrea.sdk.client.VoidClient
import io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest
import io.imulab.astrea.sdk.oauth.token.JwtSigningAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.JweContentEncodingAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.JweKeyManagementAlgorithm

class ImplicitFlowClient(source: ImplicitTokenRequest.Client) : VoidClient() {
    override val id: String = source.id
    override val responseTypes: Set<String> = source.responseTypesList.toSet()
    override val redirectUris: Set<String> = source.redirectUrisList.toSet()
    override val scopes: Set<String> = source.scopesList.toSet()
    override val grantTypes: Set<String> = source.grantTypesList.toSet()
    override val idTokenSignedResponseAlgorithm: JwtSigningAlgorithm =
        JwtSigningAlgorithm.fromSpec(source.idTokenSignedResponseAlgorithm)
    override val idTokenEncryptedResponseAlgorithm: JweKeyManagementAlgorithm =
        JweKeyManagementAlgorithm.fromSpec(source.idTokenEncryptedResponseAlgorithm)
    override val idTokenEncryptedResponseEncoding: JweContentEncodingAlgorithm =
        JweContentEncodingAlgorithm.fromSpec(source.idTokenEncryptedResponseEncoding)
    override val jwksUri: String = ""
    override val jwks: String = source.jwks
}