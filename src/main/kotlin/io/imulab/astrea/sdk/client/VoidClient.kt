package io.imulab.astrea.sdk.client

import io.imulab.astrea.sdk.commons.doNotCall
import io.imulab.astrea.sdk.oauth.token.JwtSigningAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.JweContentEncodingAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.JweKeyManagementAlgorithm
import java.time.LocalDateTime

/**
 * A void implementation of [AstreaClient]. It provides a template for various micro-services to only implement
 * parts of the client that is relevant to their processing.
 */
abstract class VoidClient : AstreaClient {
    override val creationTime: LocalDateTime by lazy { doNotCall() }
    override val lastUpdateTime: LocalDateTime by lazy { doNotCall() }
    override val applicationType: String by lazy { doNotCall() }
    override val clientUri: String by lazy { doNotCall() }
    override val contacts: LinkedHashSet<String> by lazy { doNotCall() }
    override val defaultAcrValues: List<String> by lazy { doNotCall() }
    override val defaultMaxAge: Long by lazy { doNotCall() }
    override val grantTypes: Set<String> by lazy { doNotCall() }
    override val id: String by lazy { doNotCall() }
    override val idTokenEncryptedResponseAlgorithm: JweKeyManagementAlgorithm by lazy { doNotCall() }
    override val idTokenEncryptedResponseEncoding: JweContentEncodingAlgorithm by lazy { doNotCall() }
    override val idTokenSignedResponseAlgorithm: JwtSigningAlgorithm by lazy { doNotCall() }
    override val initiateLoginUri: String by lazy { doNotCall() }
    override val jwks: String by lazy { doNotCall() }
    override val jwksUri: String by lazy { doNotCall() }
    override val logoUri: String by lazy { doNotCall() }
    override val name: String by lazy { doNotCall() }
    override val policyUri: String by lazy { doNotCall() }
    override val redirectUris: Set<String> by lazy { doNotCall() }
    override val requests: Map<String, String> by lazy { doNotCall() }
    override val requestObjectEncryptionAlgorithm: JweKeyManagementAlgorithm by lazy { doNotCall() }
    override val requestObjectEncryptionEncoding: JweContentEncodingAlgorithm by lazy { doNotCall() }
    override val requestObjectSigningAlgorithm: JwtSigningAlgorithm by lazy { doNotCall() }
    override val requestUris: List<String> by lazy { doNotCall() }
    override val requireAuthTime: Boolean by lazy { doNotCall() }
    override val responseTypes: Set<String> by lazy { doNotCall() }
    override val scopes: Set<String> by lazy { doNotCall() }
    override val secret: ByteArray by lazy { doNotCall() }
    override val sectorIdentifierUri: String by lazy { doNotCall() }
    override val subjectType: String by lazy { doNotCall() }
    override val tokenEndpointAuthenticationMethod: String by lazy { doNotCall() }
    override val tosUri: String by lazy { doNotCall() }
    override val type: String by lazy { doNotCall() }
    override val userInfoEncryptedResponseAlgorithm: JweKeyManagementAlgorithm by lazy { doNotCall() }
    override val userInfoEncryptedResponseEncoding: JweContentEncodingAlgorithm by lazy { doNotCall() }
    override val userInfoSignedResponseAlgorithm: JwtSigningAlgorithm by lazy { doNotCall() }
}