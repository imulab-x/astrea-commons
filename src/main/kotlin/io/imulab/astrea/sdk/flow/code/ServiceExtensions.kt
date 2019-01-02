package io.imulab.astrea.sdk.flow.code

import io.imulab.astrea.sdk.commons.flow.code.CodeRequest
import io.imulab.astrea.sdk.commons.flow.code.CodeResponse
import io.imulab.astrea.sdk.commons.flow.code.TokenRequest
import io.imulab.astrea.sdk.commons.flow.code.TokenResponse
import io.imulab.astrea.sdk.commons.toLocalDateTime
import io.imulab.astrea.sdk.commons.toUnixTimestamp
import io.imulab.astrea.sdk.oauth.assertType
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oauth.reserved.space
import io.imulab.astrea.sdk.oauth.response.AuthorizeEndpointResponse
import io.imulab.astrea.sdk.oidc.client.OidcClient
import io.imulab.astrea.sdk.oidc.request.OidcAuthorizeRequest
import io.imulab.astrea.sdk.oidc.request.OidcSession
import io.imulab.astrea.sdk.oidc.response.OidcTokenEndpointResponse

/**
 * Convert from [CodeRequest] to [OidcAuthorizeRequest].
 */
fun CodeRequest.toOidcAuthorizeRequest(): OidcAuthorizeRequest =
    OidcAuthorizeRequest.Builder().also { b ->
        b.client = AuthorizeCodeFlowCodeLegClient(this.client)
        b.responseTypes.addAll(this.responseTypesList)
        b.redirectUri = this.redirectUri
        b.scopes.addAll(this.scopesList)
        b.state = this.state
        b.session = OidcSession().also { s ->
            this.session.takeIf { it != null }?.let { rs ->
                s.subject = rs.subject
                s.obfuscatedSubject = rs.obfuscatedSubject
                s.authTime = rs.authenticationTime.toLocalDateTime()
                s.nonce = rs.nonce
                s.grantedScopes.addAll(rs.grantedScopesList)
                s.acrValues.addAll(rs.acrValuesList)
            }
        }
        b.nonce = session.nonce
    }.build()

/**
 * Convert from [OidcAuthorizeRequest] to [CodeRequest].
 */
fun OidcAuthorizeRequest.toCodeRequest(): CodeRequest =
    CodeRequest.newBuilder()
        .setId(id)
        .setRequestTime(requestTime.toUnixTimestamp())
        .addAllResponseTypes(responseTypes)
        .setRedirectUri(redirectUri)
        .setState(state)
        .addAllScopes(scopes)
        .setClient(
            CodeRequest.Client.newBuilder()
                .setId(client.id)
                .addAllRedirectUris(client.redirectUris)
                .addAllResponseTypes(client.responseTypes)
                .addAllScopes(client.scopes)
                .build()
        )
        .setSession(
            CodeRequest.Session.newBuilder()
                .setSubject(session.subject)
                .setObfuscatedSubject(session.assertType<OidcSession>().obfuscatedSubject)
                .addAllGrantedScopes(session.grantedScopes)
                .setAuthenticationTime(session.assertType<OidcSession>().authTime?.toUnixTimestamp() ?: 0)
                .addAllAcrValues(session.assertType<OidcSession>().acrValues)
                .setNonce(nonce)
                .build()
        )
        .build()

/**
 * Convert from [OAuthAccessRequest] to [TokenRequest].
 */
fun OAuthAccessRequest.toTokenRequest(): TokenRequest =
    TokenRequest.newBuilder()
        .setId(this.id)
        .setRequestTime(this.requestTime.toUnixTimestamp())
        .setCode(this.code)
        .setGrantType(this.grantTypes.joinToString(space))
        .setRedirectUri(this.redirectUri)
        .setClient(
            this.client.assertType<OidcClient>().let {
                TokenRequest.Client.newBuilder()
                    .setId(it.id)
                    .addAllGrantTypes(it.grantTypes)
                    .addAllRedirectUris(it.redirectUris)
                    .setJwks(it.jwks)
                    .setSectorIdentifierUri(it.sectorIdentifierUri)
                    .setSubjectType(it.subjectType)
                    .setIdTokenSignedResponseAlgorithm(it.idTokenSignedResponseAlgorithm.spec)
                    .setIdTokenEncryptedResponseAlgorithm(it.idTokenEncryptedResponseAlgorithm.spec)
                    .setIdTokenEncryptedResponseEncoding(it.idTokenEncryptedResponseEncoding.spec)
                    .build()
            }
        )
        .build()

/**
 * Convert from [TokenRequest] to [OAuthAccessRequest].
 */
fun TokenRequest.toOAuthAccessRequest(): OAuthAccessRequest =
    OAuthAccessRequest.Builder().also { b ->
        b.client = AuthorizeCodeFlowTokenLegClient(this.client)
        b.grantTypes.add(this.grantType)
        b.redirectUri = this.redirectUri
        b.code = this.code
        b.session = OidcSession()
    }.build()

/**
 * Convert from [AuthorizeEndpointResponse] to [CodeResponse].
 */
fun AuthorizeEndpointResponse.toCodeResponse() : CodeResponse =
    CodeResponse.newBuilder()
        .setSuccess(true)
        .setData(
            CodeResponse.Data.newBuilder()
                .setCode(this.code)
                .addAllScopes(this.scope)
                .build()
        )
        .build()

/**
 * Convert from [CodeResponse] to [AuthorizeEndpointResponse].
 */
fun CodeResponse.toAuthorizeEndpointResponse() : AuthorizeEndpointResponse =
    AuthorizeEndpointResponse(
        code = this.data.code,
        scope = this.data.scopesList.toSet()
    )

/**
 * Convert from [OidcTokenEndpointResponse] to [TokenResponse].
 */
fun OidcTokenEndpointResponse.toTokenResponse() : TokenResponse =
    TokenResponse.newBuilder()
        .setSuccess(true)
        .setData(
            TokenResponse.Data.newBuilder()
                .setAccessToken(this.accessToken)
                .setExpiresIn(this.expiresIn)
                .setTokenType(this.tokenType)
                .setRefreshToken(this.refreshToken)
                .setIdToken(this.idToken)
                .build()
        )
        .build()

/**
 * Convert from [TokenResponse] to [OidcTokenEndpointResponse].
 */
fun TokenResponse.toOidcTokenEndpointResponse(): OidcTokenEndpointResponse =
    OidcTokenEndpointResponse().also { r ->
        r.accessToken = this.data.accessToken ?: ""
        r.tokenType = this.data.tokenType ?: ""
        r.expiresIn = this.data.expiresIn
        r.idToken = this.data.idToken ?: ""
    }