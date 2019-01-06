package io.imulab.astrea.sdk.event

import io.imulab.astrea.sdk.commons.toUnixTimestamp
import io.imulab.astrea.sdk.oauth.assertType
import io.imulab.astrea.sdk.oidc.request.OidcAuthorizeRequest
import io.imulab.astrea.sdk.oidc.request.OidcSession
import java.time.LocalDateTime

object RefreshTokenEvents {

    const val refreshTokenCreatedEvent = "refreshToken.created"
    const val refreshTokenRevokedEvent = "refreshToken.revoked"

    val refreshTokenCreated: (String, OidcAuthorizeRequest) -> Map<String, Any> = { token, request ->
        val session = request.session.assertType<OidcSession>()
        mapOf(
            "token" to token,
            "request_id" to request.id,
            "request_at" to request.requestTime.toUnixTimestamp(),
            "client_id" to request.client.id,
            "scopes" to request.scopes,
            "obfuscated_subject" to session.obfuscatedSubject,
            "auth_time" to (session.authTime?.toUnixTimestamp() ?: 0),
            "granted_scopes" to session.grantedScopes,
            "subject" to session.subject,
            "access_token_claims" to session.accessTokenClaims,
            "id_token_claims" to session.idTokenClaims,
            "acr_values" to session.acrValues,
            "nonce" to session.nonce
        )
    }

    val refreshTokenRevoked: (String, LocalDateTime) -> Map<String, Any> = { token, revokedTime ->
        mapOf(
            "token" to token,
            "revoked_at" to revokedTime.toUnixTimestamp()
        )
    }
}