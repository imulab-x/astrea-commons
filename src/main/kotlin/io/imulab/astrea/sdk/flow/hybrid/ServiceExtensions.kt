package io.imulab.astrea.sdk.flow.hybrid

import io.imulab.astrea.sdk.commons.flow.hybrid.*
import io.imulab.astrea.sdk.commons.toLocalDateTime
import io.imulab.astrea.sdk.commons.toUnixTimestamp
import io.imulab.astrea.sdk.oauth.assertType
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oauth.reserved.space
import io.imulab.astrea.sdk.oidc.client.OidcClient
import io.imulab.astrea.sdk.oidc.request.OidcAuthorizeRequest
import io.imulab.astrea.sdk.oidc.request.OidcSession
import io.imulab.astrea.sdk.oidc.response.OidcAuthorizeEndpointResponse
import io.imulab.astrea.sdk.oidc.response.OidcTokenEndpointResponse

fun HybridCodeRequest.toOidcAuthorizeRequest(): OidcAuthorizeRequest =
    OidcAuthorizeRequest.Builder().also { b ->
        b.client = HybridFlowClient(this.client)
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

fun HybridCodeResponse.toOidcAuthorizeEndpointResponse(): OidcAuthorizeEndpointResponse =
    OidcAuthorizeEndpointResponse().also { r ->
        r.code = data.code ?: ""
        r.accessToken = this.data.accessToken ?: ""
        r.tokenType = this.data.tokenType ?: ""
        r.expiresIn = this.data.expiresIn
        r.idToken = this.data.idToken ?: ""
        r.scope = this.data.scopesList.toSet()
    }

fun OidcAuthorizeRequest.toHybridCodeRequest(): HybridCodeRequest =
    HybridCodeRequest.newBuilder()
        .setId(this.id)
        .setRequestTime(this.requestTime.toUnixTimestamp())
        .setClient(this.client.assertType<OidcClient>().toHybridClient())
        .addAllResponseTypes(this.responseTypes)
        .addAllScopes(this.scopes)
        .setRedirectUri(this.redirectUri)
        .setState(this.state)
        .setSession(
            HybridCodeRequest.Session.newBuilder()
                .setSubject(this.session.subject)
                .setObfuscatedSubject(this.session.assertType<OidcSession>().obfuscatedSubject)
                .addAllGrantedScopes(this.session.grantedScopes)
                .setAuthenticationTime(this.session.assertType<OidcSession>().authTime?.toUnixTimestamp() ?: 0)
                .addAllAcrValues(this.session.assertType<OidcSession>().acrValues)
                .setNonce(this.nonce)
                .build()
        )
        .build()

fun OidcAuthorizeEndpointResponse.toHybridCodeResponse(): HybridCodeResponse =
    HybridCodeResponse.newBuilder()
        .setSuccess(true)
        .setData(
            HybridCodeResponse.Data.newBuilder()
                .setCode(this.code)
                .setAccessToken(this.accessToken)
                .setExpiresIn(this.expiresIn)
                .setTokenType(this.tokenType)
                .setRefreshToken(this.refreshToken)
                .setIdToken(this.idToken)
                .addAllScopes(this.scope)
                .build()
        )
        .build()

fun OidcClient.toHybridClient(): HybridClient =
    HybridClient.newBuilder()
        .setId(this.id)
        .addAllResponseTypes(this.responseTypes)
        .addAllGrantTypes(this.grantTypes)
        .addAllRedirectUris(this.redirectUris)
        .addAllScopes(this.scopes)
        .setJwks(this.jwks)
        .setSubjectType(this.subjectType)
        .setSectorIdentifierUri(this.sectorIdentifierUri)
        .setIdTokenSignedResponseAlgorithm(this.idTokenSignedResponseAlgorithm.spec)
        .setIdTokenEncryptedResponseAlgorithm(this.idTokenEncryptedResponseAlgorithm.spec)
        .setIdTokenEncryptedResponseEncoding(this.idTokenEncryptedResponseEncoding.spec)
        .build()

fun HybridTokenRequest.toOAuthAccessRequest(): OAuthAccessRequest =
    OAuthAccessRequest.Builder().also { b ->
        b.client = HybridFlowClient(this.client)
        b.grantTypes.add(this.grantType)
        b.redirectUri = this.redirectUri
        b.code = this.code
        b.session = OidcSession()
    }.build()

fun HybridTokenResponse.toOidcTokenEndpointResponse(): OidcTokenEndpointResponse =
    OidcTokenEndpointResponse().also { r ->
        r.accessToken = this.data.accessToken ?: ""
        r.tokenType = this.data.tokenType ?: ""
        r.expiresIn = this.data.expiresIn
        r.idToken = this.data.idToken ?: ""
        r.refreshToken = this.data.refreshToken ?: ""
    }

fun OAuthAccessRequest.toHybridTokenRequest(): HybridTokenRequest =
    HybridTokenRequest.newBuilder()
        .setId(this.id)
        .setRequestTime(this.requestTime.toUnixTimestamp())
        .setCode(this.code)
        .setGrantType(this.grantTypes.joinToString(space))
        .setRedirectUri(this.redirectUri)
        .setClient(this.client.assertType<OidcClient>().toHybridClient())
        .build()

fun OidcTokenEndpointResponse.toHybridTokenResponse() : HybridTokenResponse =
    HybridTokenResponse.newBuilder()
        .setSuccess(true)
        .setData(
            HybridTokenResponse.Data.newBuilder()
                .setAccessToken(this.accessToken)
                .setExpiresIn(this.expiresIn)
                .setTokenType(this.tokenType)
                .setRefreshToken(this.refreshToken)
                .setIdToken(this.idToken)
                .build()
        )
        .build()