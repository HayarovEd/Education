package com.edurda77.education.utils

import java.text.SimpleDateFormat
import java.util.*

fun dateToTime (date: String) : String? {
    val format = SimpleDateFormat(FORMAT_DATE, Locale.getDefault())
    return format.parse(date)?.toString()
}