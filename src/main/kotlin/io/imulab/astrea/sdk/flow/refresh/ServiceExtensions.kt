package io.imulab.astrea.sdk.flow.refresh

import io.imulab.astrea.sdk.commons.flow.refresh.RefreshRequest
import io.imulab.astrea.sdk.commons.flow.refresh.RefreshResponse
import io.imulab.astrea.sdk.commons.toUnixTimestamp
import io.imulab.astrea.sdk.oauth.assertType
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oidc.client.OidcClient
import io.imulab.astrea.sdk.oidc.request.OidcSession
import io.imulab.astrea.sdk.oidc.response.OidcTokenEndpointResponse

fun OAuthAccessRequest.toRefreshRequest(): RefreshRequest =
    RefreshRequest.newBuilder()
        .setId(this.id)
        .setRequestTime(this.requestTime.toUnixTimestamp())
        .addAllGrantTypes(this.grantTypes)
        .setRefreshToken(this.refreshToken)
        .setClient(this.client.assertType<OidcClient>().toRefreshRequestClient())
        .build()

internal fun OidcClient.toRefreshRequestClient(): RefreshRequest.Client =
    RefreshRequest.Client.newBuilder()
        .setId(this.id)
        .addAllGrantTypes(this.grantTypes)
        .setJwks(this.jwks)
        .setIdTokenSignedResponseAlgorithm(this.idTokenSignedResponseAlgorithm.spec)
        .setIdTokenEncryptedResponseAlgorithm(this.idTokenEncryptedResponseAlgorithm.spec)
        .setIdTokenEncryptedResponseEncoding(this.idTokenEncryptedResponseEncoding.spec)
        .build()

fun RefreshRequest.toAccessRequest(): OAuthAccessRequest =
    OAuthAccessRequest.Builder().also { b ->
        b.refreshToken = this.refreshToken
        b.grantTypes.addAll(this.grantTypesList)
        b.client = RefreshClient(this.client)
        b.session = OidcSession()
    }.build()

fun RefreshResponse.toOidcTokenEndpointResponse() : OidcTokenEndpointResponse =
    OidcTokenEndpointResponse().apply {
        accessToken = this@toOidcTokenEndpointResponse.data.accessToken ?: ""
        expiresIn = this@toOidcTokenEndpointResponse.data.expiresIn
        tokenType = this@toOidcTokenEndpointResponse.data.tokenType ?: ""
        scope = this@toOidcTokenEndpointResponse.data.scopesList?.toSet() ?: emptySet()
        refreshToken = this@toOidcTokenEndpointResponse.data.refreshToken ?: ""
        idToken = this@toOidcTokenEndpointResponse.data.idToken ?: ""
    }

fun OidcTokenEndpointResponse.toRefreshResponse() : RefreshResponse =
    RefreshResponse.newBuilder()
        .setSuccess(true)
        .setData(
            RefreshResponse.Data.newBuilder()
                .setAccessToken(this.accessToken)
                .setExpiresIn(this.expiresIn)
                .setTokenType(this.tokenType)
                .addAllScopes(this.scope)
                .setRefreshToken(this.refreshToken)
                .setIdToken(this.idToken)
                .build()
        )
        .build()