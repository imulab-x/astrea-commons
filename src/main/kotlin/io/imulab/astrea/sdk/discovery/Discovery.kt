package io.imulab.astrea.sdk.discovery

import io.imulab.astrea.sdk.commons.discovery.DiscoveryResponse
import io.imulab.astrea.sdk.oidc.discovery.Discovery

/**
 * Convert from [DiscoveryResponse] to [Discovery].
 */
fun DiscoveryResponse.toDiscovery(): Discovery = object : Discovery {
    override val acrValuesSupported: List<String>
        get() = this@toDiscovery.acrValuesSupportedList
    override val authorizationEndpoint: String
        get() = this@toDiscovery.authorizationEndpoint
    override val claimsLocalesSupported: List<String>
        get() = this@toDiscovery.claimsLocalesSupportedList
    override val claimsSupported: List<String>
        get() = this@toDiscovery.claimsSupportedList
    override val displayValuesSupported: List<String>
        get() = this@toDiscovery.displayValuesSupportedList
    override val idTokenEncryptionAlgorithmValuesSupported: List<String>
        get() = this@toDiscovery.idTokenEncryptionAlgorithmValuesSupportedList
    override val idTokenEncryptionEncodingValuesSupported: List<String>
        get() = this@toDiscovery.idTokenEncryptionEncodingValuesSupportedList
    override val idTokenSigningAlgorithmValuesSupported: List<String>
        get() = this@toDiscovery.idTokenSigningAlgorithmValuesSupportedList
    override val issuer: String
        get() = this@toDiscovery.issuer
    override val jwksUri: String
        get() = this@toDiscovery.jwksUri
    override val opPolicyUri: String
        get() = this@toDiscovery.opPolicyUri
    override val registrationEndpoint: String
        get() = this@toDiscovery.registrationEndpoint
    override val requestObjectEncryptionAlgorithmValuesSupported: List<String>
        get() = this@toDiscovery.requestObjectEncryptionAlgorithmValuesSupportedList
    override val requestObjectEncryptionEncodingValuesSupported: List<String>
        get() = this@toDiscovery.requestObjectEncryptionEncodingValuesSupportedList
    override val requestObjectSigningAlgorithmValuesSupported: List<String>
        get() = this@toDiscovery.requestObjectSigningAlgorithmValuesSupportedList
    override val responseTypesSupported: List<String>
        get() = this@toDiscovery.responseTypesSupportedList
    override val scopesSupported: List<String>
        get() = this@toDiscovery.scopesSupportedList
    override val serviceDocumentation: String
        get() = this@toDiscovery.serviceDocumentation
    override val subjectTypesSupported: List<String>
        get() = this@toDiscovery.subjectTypesSupportedList
    override val tokenEndpoint: String
        get() = this@toDiscovery.tokenEndpoint
    override val tokenEndpointAuthenticationSigningAlgorithmValuesSupported: List<String>
        get() = this@toDiscovery.tokenEndpointAuthenticationSigningAlgorithmValuesSupportedList
    override val uiLocalesSupported: List<String>
        get() = this@toDiscovery.uiLocalesSupportedList
    override val userInfoEncryptionAlgorithmValuesSupported: List<String>
        get() = this@toDiscovery.userInfoEncryptionAlgorithmValuesSupportedList
    override val userInfoEncryptionEncodingValuesSupported: List<String>
        get() = this@toDiscovery.userInfoEncryptionEncodingValuesSupportedList
    override val userInfoEndpoint: String
        get() = this@toDiscovery.userInfoEndpoint
    override val userInfoSigningAlgorithmValuesSupported: List<String>
        get() = this@toDiscovery.userInfoSigningAlgorithmValuesSupportedList
}