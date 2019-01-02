package io.imulab.astrea.sdk.flow.cc

import io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenRequest
import io.imulab.astrea.sdk.commons.flow.cc.ClientCredentialsTokenResponse
import io.imulab.astrea.sdk.commons.toUnixTimestamp
import io.imulab.astrea.sdk.oauth.assertType
import io.imulab.astrea.sdk.oauth.request.OAuthAccessRequest
import io.imulab.astrea.sdk.oauth.response.TokenEndpointResponse
import io.imulab.astrea.sdk.oidc.client.OidcClient
import io.imulab.astrea.sdk.oidc.request.OidcSession

/**
 * Convert from [OAuthAccessRequest] to [ClientCredentialsTokenRequest]
 */
fun OAuthAccessRequest.toClientCredentialsTokenRequest(): ClientCredentialsTokenRequest {
    return ClientCredentialsTokenRequest.newBuilder()
        .setId(id)
        .setRequestTime(requestTime.toUnixTimestamp())
        .addAllGrantTypes(grantTypes)
        .addAllScopes(scopes)
        .setClient(client.assertType<OidcClient>().toTokenRequestClient())
        .build()
}

internal fun OidcClient.toTokenRequestClient(): ClientCredentialsTokenRequest.Client {
    return ClientCredentialsTokenRequest.Client.newBuilder()
        .setId(id)
        .setType(type)
        .addAllGrantTypes(grantTypes)
        .addAllScopes(scopes)
        .build()
}

/**
 * Convert from [ClientCredentialsTokenRequest] to [OAuthAccessRequest].
 */
fun ClientCredentialsTokenRequest.toAccessRequest(): OAuthAccessRequest {
    return OAuthAccessRequest.Builder().also { b ->
        b.grantTypes.addAll(grantTypesList)
        b.scopes.addAll(scopesList)
        b.client = ClientCredentialsClient(client)
        b.session = OidcSession()
    }.build()
}

/**
 * Convert from [TokenEndpointResponse] to [ClientCredentialsTokenResponse].
 */
fun TokenEndpointResponse.toClientCredentialsTokenResponse(): ClientCredentialsTokenResponse {
    return ClientCredentialsTokenResponse.newBuilder()
        .setSuccess(true)
        .setData(
            ClientCredentialsTokenResponse.Data.newBuilder()
                .setAccessToken(accessToken)
                .setTokenType(tokenType)
                .setExpiresIn(expiresIn)
                .addAllScopes(scope)
                .setRefreshToken(refreshToken)
                .build()
        )
        .build()
}

/**
 * Convert from [ClientCredentialsTokenResponse] to [TokenEndpointResponse].
 */
fun ClientCredentialsTokenResponse.toTokenEndpointResponse(): TokenEndpointResponse {
    return io.imulab.astrea.sdk.oauth.response.TokenEndpointResponse(
        accessToken = data.accessToken ?: "",
        expiresIn = data.expiresIn,
        tokenType = data.tokenType ?: "",
        scope = data.scopesList?.toSet() ?: kotlin.collections.emptySet(),
        refreshToken = data.refreshToken ?: ""
    )
}