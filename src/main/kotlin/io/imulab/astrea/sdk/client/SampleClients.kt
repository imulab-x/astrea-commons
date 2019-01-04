package io.imulab.astrea.sdk.client

import io.imulab.astrea.sdk.oauth.reserved.*
import io.imulab.astrea.sdk.oauth.token.JwtSigningAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.ApplicationType
import io.imulab.astrea.sdk.oidc.reserved.JweContentEncodingAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.JweKeyManagementAlgorithm
import io.imulab.astrea.sdk.oidc.reserved.SubjectType

object SampleClients {

    /**
     * A sample client that has basically all grants.
     */
    val foo = DefaultClient(
        id = "foo",
        clientName = "Foo",
        clientType = ClientType.confidential,
        clientSecret = "12345678123456781234567812345678",
        redirectUris = mutableSetOf(
            "http://localhost:3000/callback",
            "http://localhost:3001/callback"
        ),
        responseTypes = mutableSetOf(
            ResponseType.code,
            ResponseType.token,
            io.imulab.astrea.sdk.oidc.reserved.ResponseType.idToken
        ),
        grantTypes = mutableSetOf(
            GrantType.authorizationCode,
            GrantType.implicit,
            GrantType.refreshToken,
            GrantType.clientCredentials
        ),
        scopes = mutableSetOf(
            "foo",
            "bar",
            StandardScope.offlineAccess,
            io.imulab.astrea.sdk.oidc.reserved.StandardScope.openid
        ),
        applicationType = ApplicationType.web,
        contacts = LinkedHashSet(listOf(
            "foo@imulab.io",
            "bar@imulab.io"
        )),
        logoUri = "http://localhost:3000/logo.png",
        clientUri = "http://localhost:3000/client",
        policyUri = "http://localhost:3000/policy",
        tosUri = "http://localhost:3000/terms_of_service",
        jwksUri = "",
        jwks = "",
        sectorIdentifierUri = "",
        subjectType = SubjectType.public,
        idTokenSignedResponseAlg = JwtSigningAlgorithm.RS256.spec,
        idTokenEncryptedResponseAlg = JweKeyManagementAlgorithm.None.spec,
        idTokenEncryptedResponseEnc = JweContentEncodingAlgorithm.None.spec,
        requestObjectSigningAlg = JwtSigningAlgorithm.RS256.spec,
        requestObjectEncryptionAlg = JweKeyManagementAlgorithm.None.spec,
        requestObjectEncryptionEnc = JweContentEncodingAlgorithm.None.spec,
        userinfoSignedResponseAlg = JwtSigningAlgorithm.None.spec,
        userinfoEncryptedResponseAlg = JweKeyManagementAlgorithm.None.spec,
        userinfoEncryptedResponseEnc = JweContentEncodingAlgorithm.None.spec,
        tokenEndpointAuthMethod = AuthenticationMethod.clientSecretPost,
        tokenEndpointAuthenticationSigningAlg = JwtSigningAlgorithm.None.spec,
        defaultMaxAge = 3600,
        requireAuthTime = true,
        defaultAcrValues = mutableListOf(),
        initiateLoginUri = "",
        requestUris = mutableListOf()
    )
}