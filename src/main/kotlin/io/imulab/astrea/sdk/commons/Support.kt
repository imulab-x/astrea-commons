package io.imulab.astrea.sdk.commons

import java.time.LocalDateTime
import java.time.ZoneOffset

val doNotCall: () -> Nothing = {
    throw NotImplementedError("This operation should not be called.")
}

fun LocalDateTime.toUnixTimestamp(): Long = toEpochSecond(ZoneOffset.UTC)
fun Long.toLocalDateTime(): LocalDateTime = LocalDateTime.ofEpochSecond(this, 0, ZoneOffset.UTC)