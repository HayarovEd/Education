package com.edurda77.education.utils

import java.text.SimpleDateFormat
import java.util.*

fun dateToTime (date: String) : String? {
    val format = SimpleDateFormat(FORMAT_DATE, Locale.getDefault())
    return format.parse(date)?.toString()
}

fun calcToLeft(date: String): Long {
    val currentTime = Calendar.getInstance().time
    val format = SimpleDateFormat(FORMAT_DATE, Locale.getDefault())
    val diff = format.parse(date).time-currentTime.time
    val secondsInMilli: Long = 1000
    val minutesInMilli = secondsInMilli * 60
    val hoursInMilli = minutesInMilli * 60
    val daysInMilli = hoursInMilli * 24
    return diff / daysInMilli
}