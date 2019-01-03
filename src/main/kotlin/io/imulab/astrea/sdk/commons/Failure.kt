package io.imulab.astrea.sdk.commons

import io.imulab.astrea.sdk.commons.op.Failure
import io.imulab.astrea.sdk.oauth.error.OAuthException

fun Failure.toOAuthException(): OAuthException =
    OAuthException(
        status = this.status,
        error = this.error,
        description = this.description,
        headers = this.headersMap
    )

fun OAuthException.toFailure(): Failure =
    Failure.newBuilder()
        .setStatus(this.status)
        .setError(this.error)
        .setDescription(this.description)
        .putAllHeaders(this.headers)
        .build()