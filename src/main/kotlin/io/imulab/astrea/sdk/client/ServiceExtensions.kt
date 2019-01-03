package io.imulab.astrea.sdk.client

import io.imulab.astrea.sdk.commons.client.ClientLookupResponse
import io.imulab.astrea.sdk.commons.toLocalDateTime
import io.imulab.astrea.sdk.commons.toUnixTimestamp
import java.nio.charset.StandardCharsets

/**
 * Convert from [AstreaClient] to [ClientLookupResponse].
 */
fun AstreaClient.toClientLookupResponse(): ClientLookupResponse =
    ClientLookupResponse.newBuilder()
        .setSuccess(true)
        .setData(
            ClientLookupResponse.Data.newBuilder()
                .setId(id)
                .setCreationTime(creationTime.toUnixTimestamp())
                .setLastUpdateTime(lastUpdateTime.toUnixTimestamp())
                .setName(name)
                .setSecret(secret.toString(StandardCharsets.UTF_8))
                .setType(type)
                .addAllRedirectUris(redirectUris)
                .addAllResponseTypes(responseTypes)
                .addAllGrantTypes(grantTypes)
                .addAllScopes(scopes)
                .setApplicationType(applicationType)
                .addAllContacts(contacts)
                .setLogoUri(logoUri)
                .setClientUri(clientUri)
                .setPolicyUri(policyUri)
                .setTosUri(tosUri)
                .setJwks(jwks)
                .setSectorIdentifierUri(sectorIdentifierUri)
                .setSubjectType(subjectType)
                .setIdTokenSignedResponseAlgorithm(idTokenSignedResponseAlgorithm.spec)
                .setIdTokenEncryptedResponseAlgorithm(idTokenEncryptedResponseAlgorithm.spec)
                .setIdTokenEncryptedResponseEncoding(idTokenEncryptedResponseEncoding.spec)
                .setRequestObjectSigningAlgorithm(requestObjectSigningAlgorithm.spec)
                .setRequestObjectEncryptionAlgorithm(requestObjectEncryptionAlgorithm.spec)
                .setRequestObjectEncryptionEncoding(requestObjectEncryptionEncoding.spec)
                .setUserInfoSignedResponseAlgorithm(userInfoSignedResponseAlgorithm.spec)
                .setUserInfoEncryptedResponseAlgorithm(userInfoEncryptedResponseAlgorithm.spec)
                .setUserInfoEncryptedResponseEncoding(userInfoEncryptedResponseEncoding.spec)
                .setTokenEndpointAuthenticationMethod(tokenEndpointAuthenticationMethod)
                .setTokenEndpointAuthenticationSigningAlgorithm(tokenEndpointAuthenticationSigningAlgorithm.spec)
                .setDefaultMaxAge(defaultMaxAge)
                .setRequireAuthTime(requireAuthTime)
                .addAllDefaultAcrValues(defaultAcrValues)
                .setInitiateLoginUri(initiateLoginUri)
                .putAllRequests(requests)
                .build()
        )
        .build()

/**
 * Convert from [ClientLookupResponse] to [DefaultClient].
 */
fun ClientLookupResponse.toDefaultClient(): DefaultClient =
    DefaultClient(
        id = data.id,
        creationTime = data.creationTime.toLocalDateTime(),
        lastUpdateTime = data.lastUpdateTime.toLocalDateTime(),
        clientName = data.name,
        clientSecret = data.secret,
        clientType = data.type,
        redirectUris = data.redirectUrisList.toMutableSet(),
        responseTypes = data.responseTypesList.toMutableSet(),
        grantTypes = data.grantTypesList.toMutableSet(),
        scopes = data.scopesList.toMutableSet(),
        applicationType = data.applicationType,
        contacts = LinkedHashSet(data.contactsList),
        logoUri = data.logoUri,
        clientUri = data.clientUri,
        policyUri = data.policyUri,
        tosUri = data.tosUri,
        jwksUri = "",
        jwks = data.jwks,
        sectorIdentifierUri = data.sectorIdentifierUri,
        subjectType = data.subjectType,
        idTokenSignedResponseAlg = data.idTokenSignedResponseAlgorithm,
        idTokenEncryptedResponseAlg = data.idTokenEncryptedResponseAlgorithm,
        idTokenEncryptedResponseEnc = data.idTokenEncryptedResponseEncoding,
        requestObjectSigningAlg = data.requestObjectSigningAlgorithm,
        requestObjectEncryptionAlg = data.requestObjectEncryptionAlgorithm,
        requestObjectEncryptionEnc = data.requestObjectEncryptionEncoding,
        userinfoSignedResponseAlg = data.userInfoSignedResponseAlgorithm,
        userinfoEncryptedResponseAlg = data.userInfoEncryptedResponseAlgorithm,
        userinfoEncryptedResponseEnc = data.userInfoEncryptedResponseEncoding,
        tokenEndpointAuthMethod = data.tokenEndpointAuthenticationMethod,
        tokenEndpointAuthenticationSigningAlg = data.tokenEndpointAuthenticationSigningAlgorithm,
        defaultMaxAge = data.defaultMaxAge,
        requireAuthTime = data.requireAuthTime,
        defaultAcrValues = data.defaultAcrValuesList,
        initiateLoginUri = data.initiateLoginUri,
        requestUris = data.requestsMap.keys.toMutableList(),
        requests = data.requestsMap
    )