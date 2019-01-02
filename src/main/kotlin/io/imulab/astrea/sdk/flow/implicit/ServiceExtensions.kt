package io.imulab.astrea.sdk.flow.implicit

import io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenRequest
import io.imulab.astrea.sdk.commons.flow.implicit.ImplicitTokenResponse
import io.imulab.astrea.sdk.oauth.assertType
import io.imulab.astrea.sdk.oidc.client.OidcClient
import io.imulab.astrea.sdk.oidc.request.OidcAuthorizeRequest
import io.imulab.astrea.sdk.oidc.request.OidcSession
import io.imulab.astrea.sdk.oidc.response.OidcAuthorizeEndpointResponse
import java.time.LocalDateTime
import java.time.ZoneOffset

/**
 * Convert from [OidcAuthorizeRequest] to [ImplicitTokenRequest].
 */
fun OidcAuthorizeRequest.toImplicitTokenRequest(): ImplicitTokenRequest =
    ImplicitTokenRequest.newBuilder()
        .setId(id)
        .setRequestTime(requestTime.toEpochSecond(ZoneOffset.UTC))
        .addAllResponseTypes(responseTypes)
        .setRedirectUri(redirectUri)
        .setState(state)
        .addAllScopes(scopes)
        .setNonce(nonce)
        .setClient(client.assertType<OidcClient>().toTokenRequestClient())
        .setSession(session.assertType<OidcSession>().toTokenRequestSession())
        .build()

internal fun OidcClient.toTokenRequestClient(): ImplicitTokenRequest.Client {
    return ImplicitTokenRequest.Client.newBuilder()
        .setId(id)
        .addAllResponseTypes(responseTypes)
        .addAllGrantTypes(grantTypes)
        .addAllRedirectUris(redirectUris)
        .addAllScopes(scopes)
        .setJwks(jwks)
        .setIdTokenSignedResponseAlgorithm(idTokenSignedResponseAlgorithm.spec)
        .setIdTokenEncryptedResponseAlgorithm(idTokenEncryptedResponseAlgorithm.spec)
        .setIdTokenEncryptedResponseEncoding(idTokenEncryptedResponseEncoding.spec)
        .build()
}

internal fun OidcSession.toTokenRequestSession(): ImplicitTokenRequest.Session {
    return ImplicitTokenRequest.Session.newBuilder()
        .setSubject(subject)
        .setObfuscatedSubject(obfuscatedSubject)
        .addAllGrantedScopes(grantedScopes)
        .addAllAcrValues(acrValues)
        .setAuthenticationTime(authTime?.toEpochSecond(ZoneOffset.UTC) ?: 0)
        .setNonce(nonce)
        .build()
}

/**
 * Convert from [ImplicitTokenRequest] to [OidcAuthorizeRequest].
 */
fun ImplicitTokenRequest.toOidcAuthorizeRequest(): OidcAuthorizeRequest =
    OidcAuthorizeRequest.Builder().also { b ->
        b.responseTypes.addAll(responseTypesList)
        b.redirectUri = redirectUri ?: ""
        b.state = state ?: ""
        b.scopes.addAll(scopesList)
        b.client = ImplicitFlowClient(client)
        b.nonce = nonce
        b.session = OidcSession().also { s ->
            s.subject = session.subject ?: ""
            s.obfuscatedSubject = session.obfuscatedSubject ?: ""
            s.authTime = LocalDateTime.ofEpochSecond(session.authenticationTime, 0, ZoneOffset.UTC)
            s.acrValues.addAll(session.acrValuesList)
            s.nonce = nonce ?: session.nonce ?: ""
            s.grantedScopes.addAll(session.grantedScopesList)
        }
    }.build()

/**
 * Convert from [OidcAuthorizeEndpointResponse] to [ImplicitTokenResponse].
 */
fun OidcAuthorizeEndpointResponse.toImplicitTokenResponse() : ImplicitTokenResponse =
    ImplicitTokenResponse.newBuilder()
        .setSuccess(true)
        .setData(
            ImplicitTokenResponse.Data.newBuilder()
                .setAccessToken(this.accessToken)
                .setTokenType(this.tokenType)
                .setExpiresIn(this.expiresIn)
                .addAllScopes(this.scope)
                .setIdToken(this.idToken)
                .build()
        )
        .build()

/**
 * Convert from [ImplicitTokenResponse] to [OidcAuthorizeEndpointResponse].
 */
fun ImplicitTokenResponse.toOidcAuthorizeEndpointResponse(): OidcAuthorizeEndpointResponse =
    OidcAuthorizeEndpointResponse().also { r ->
        r.accessToken = this.data.accessToken
        r.tokenType = this.data.tokenType
        r.expiresIn = this.data.expiresIn
        r.idToken = this.data.idToken
        r.scope = this.data.scopesList.toSet()
    }