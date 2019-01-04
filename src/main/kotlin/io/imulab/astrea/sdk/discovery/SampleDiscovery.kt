package io.imulab.astrea.sdk.discovery

import io.imulab.astrea.sdk.oauth.reserved.ResponseType
import io.imulab.astrea.sdk.oauth.token.JwtSigningAlgorithm
import io.imulab.astrea.sdk.oidc.discovery.Discovery
import io.imulab.astrea.sdk.oidc.reserved.*

object SampleDiscovery {

    val default = object : Discovery {
        override val acrValuesSupported: List<String>
            get() = emptyList()
        override val authorizationEndpoint: String
            get() = "https://astrea.io/oauth/authorize"
        override val claimsLocalesSupported: List<String>
            get() = listOf("en")
        override val claimsSupported: List<String>
            get() = emptyList()
        override val displayValuesSupported: List<String>
            get() = listOf(Display.page)
        override val idTokenEncryptionAlgorithmValuesSupported: List<String>
            get() = listOf(JweKeyManagementAlgorithm.RSA1_5.spec, JweKeyManagementAlgorithm.None.spec)
        override val idTokenEncryptionEncodingValuesSupported: List<String>
            get() = listOf(JweContentEncodingAlgorithm.A128CBC_HS256.spec, JweContentEncodingAlgorithm.None.spec)
        override val idTokenSigningAlgorithmValuesSupported: List<String>
            get() = listOf(JwtSigningAlgorithm.RS256.spec, JwtSigningAlgorithm.None.spec)
        override val issuer: String
            get() = "https://astrea.io"
        override val jwksUri: String
            get() = "https://astrea.io/jwks"
        override val opPolicyUri: String
            get() = "https://astrea.io/doc/policy"
        override val registrationEndpoint: String
            get() = "https://astrea.io/client"
        override val requestObjectEncryptionAlgorithmValuesSupported: List<String>
            get() = listOf(JweKeyManagementAlgorithm.RSA1_5.spec, JweKeyManagementAlgorithm.None.spec)
        override val requestObjectEncryptionEncodingValuesSupported: List<String>
            get() = listOf(JweContentEncodingAlgorithm.A128CBC_HS256.spec, JweContentEncodingAlgorithm.None.spec)
        override val requestObjectSigningAlgorithmValuesSupported: List<String>
            get() = listOf(JwtSigningAlgorithm.RS256.spec, JwtSigningAlgorithm.None.spec)
        override val responseTypesSupported: List<String>
            get() = listOf(ResponseType.code, ResponseType.token, io.imulab.astrea.sdk.oidc.reserved.ResponseType.idToken)
        override val scopesSupported: List<String>
            get() = listOf(StandardScope.openid, io.imulab.astrea.sdk.oauth.reserved.StandardScope.offlineAccess)
        override val serviceDocumentation: String
            get() = "https://astrea.io/doc/service"
        override val subjectTypesSupported: List<String>
            get() = listOf(SubjectType.public, SubjectType.public)
        override val tokenEndpoint: String
            get() = "https://astrea.io/oauth/token"
        override val tokenEndpointAuthenticationSigningAlgorithmValuesSupported: List<String>
            get() = listOf(JwtSigningAlgorithm.RS256.spec, JwtSigningAlgorithm.HS256.spec, JwtSigningAlgorithm.None.spec)
        override val uiLocalesSupported: List<String>
            get() = listOf("en")
        override val userInfoEncryptionAlgorithmValuesSupported: List<String>
            get() = listOf(JweKeyManagementAlgorithm.RSA1_5.spec, JweKeyManagementAlgorithm.None.spec)
        override val userInfoEncryptionEncodingValuesSupported: List<String>
            get() = listOf(JweContentEncodingAlgorithm.A128CBC_HS256.spec, JweContentEncodingAlgorithm.None.spec)
        override val userInfoEndpoint: String
            get() = "https://astrea.io/userinfo"
        override val userInfoSigningAlgorithmValuesSupported: List<String>
            get() = listOf(JwtSigningAlgorithm.RS256.spec, JwtSigningAlgorithm.None.spec)
    }
}