package com.testproject.presentation

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun millisToDate(millis: Long?): String {
    return millis?.let {
        Instant.fromEpochMilliseconds(it)
            .toLocalDateTime(TimeZone.currentSystemDefault())
            .date.toString()
    } ?: ""

}