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

/**
 * Convert from [Discovery] to [DiscoveryResponse].
 */
fun Discovery.toDiscoveryResponse(): DiscoveryResponse =
    DiscoveryResponse.newBuilder()
        .setIssuer(this.issuer)
        .setAuthorizationEndpoint(this.authorizationEndpoint)
        .setTokenEndpoint(this.tokenEndpoint)
        .setUserInfoEndpoint(this.userInfoEndpoint)
        .setJwksUri(this.jwksUri)
        .setRegistrationEndpoint(this.registrationEndpoint)
        .addAllScopesSupported(this.scopesSupported)
        .addAllResponseTypesSupported(this.responseTypesSupported)
        .addAllResponseModeSupported(this.responseModeSupported)
        .addAllGrantTypesSupported(this.grantTypesSupported)
        .addAllAcrValuesSupported(this.acrValuesSupported)
        .addAllSubjectTypesSupported(this.subjectTypesSupported)
        .addAllIdTokenSigningAlgorithmValuesSupported(this.idTokenSigningAlgorithmValuesSupported)
        .addAllIdTokenEncryptionAlgorithmValuesSupported(this.idTokenEncryptionAlgorithmValuesSupported)
        .addAllIdTokenEncryptionEncodingValuesSupported(this.idTokenEncryptionEncodingValuesSupported)
        .addAllUserInfoSigningAlgorithmValuesSupported(this.userInfoSigningAlgorithmValuesSupported)
        .addAllUserInfoEncryptionAlgorithmValuesSupported(this.userInfoEncryptionAlgorithmValuesSupported)
        .addAllUserInfoEncryptionEncodingValuesSupported(this.userInfoEncryptionEncodingValuesSupported)
        .addAllRequestObjectSigningAlgorithmValuesSupported(this.requestObjectSigningAlgorithmValuesSupported)
        .addAllRequestObjectEncryptionAlgorithmValuesSupported(this.requestObjectEncryptionAlgorithmValuesSupported)
        .addAllRequestObjectEncryptionEncodingValuesSupported(this.requestObjectEncryptionEncodingValuesSupported)
        .addAllTokenEndpointAuthenticationMethodsSupported(this.tokenEndpointAuthenticationMethodsSupported)
        .addAllTokenEndpointAuthenticationSigningAlgorithmValuesSupported(this.tokenEndpointAuthenticationSigningAlgorithmValuesSupported)
        .addAllDisplayValuesSupported(this.displayValuesSupported)
        .addAllClaimTypesSupported(this.claimTypesSupported)
        .addAllClaimsSupported(this.claimsSupported)
        .setServiceDocumentation(this.serviceDocumentation)
        .addAllClaimsLocalesSupported(this.claimsLocalesSupported)
        .addAllUiLocalesSupported(this.uiLocalesSupported)
        .setClaimsParameterSupported(this.claimsParameterSupported)
        .setRequestParameterSupported(this.requestParameterSupported)
        .setRequestUriParameterSupported(this.requestUriParameterSupported)
        .setRequireRequestUriRegistration(this.requireRequestUriRegistration)
        .setOpPolicyUri(this.opPolicyUri)
        .build()