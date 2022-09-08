package com.edurda77.education.repositories

import android.os.CountDownTimer
import com.edurda77.education.R
import com.edurda77.education.entity.Work
import com.edurda77.education.utils.END_DATE
import com.edurda77.education.utils.FORMAT_DATE
import java.text.SimpleDateFormat
import java.util.*

object Repository {
    private val currentLessons = mutableListOf<Work>()



    fun addLessons(): List<Work> {

        currentLessons.add(
            Work(
                picture = R.drawable.ic_stand_up,
                nameWork = "Утренний подъем",
                dateBeginWork = "06/09/2022 06:45:00",
                dateEndWork = "06/09/2022 07:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 06:45:00", "06/09/2022 07:00:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.ic_breakfast,
                nameWork = "Завтрак",
                dateBeginWork = "06/09/2022 07:01:00",
                dateEndWork = "06/09/2022 08:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 07:01:00", "06/09/2022 08:00:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.ic_move,
                nameWork = "Поездка на работу",
                dateBeginWork = "06/09/2022 08:01:00",
                dateEndWork = "06/09/2022 09:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 08:01:00", "06/09/2022 09:00:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.icon_work,
                nameWork = "Работа",
                dateBeginWork = "08/09/2022 09:01:00",
                dateEndWork = "08/09/2022 13:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 09:01:00", "08/09/2022 13:00:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.ic_lounch,
                nameWork = "Обед",
                dateBeginWork = "05/09/2022 13:01:00",
                dateEndWork = "05/09/2022 13:45:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 13:01:00", "06/09/2022 13:45:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.icon_work,
                nameWork = "Работа",
                dateBeginWork = "05/09/2022 13:46:00",
                dateEndWork = "05/09/2022 18:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 13:46:00", "06/09/2022 18:00:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.ic_move,
                nameWork = "Поездка домой",
                dateBeginWork = "05/09/2022 18:01:00",
                dateEndWork = "05/09/2022 19:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 18:01:00", "06/09/2022 19:00:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.ic_dinner,
                nameWork = "Ужин",
                dateBeginWork = "05/09/2022 19:01:00",
                dateEndWork = "05/09/2022 19:30:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 19:01:00", "06/09/2022 19:30:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.ic_homework,
                nameWork = "Вечернее время",
                dateBeginWork = "05/09/2022 19:31:00",
                dateEndWork = "05/09/2022 22:30:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 19:31:00", "06/09/2022 22:30:00"),
            )
        )
        currentLessons.add(
            Work(
                picture = R.drawable.ic_dream,
                nameWork = "Сон",
                dateBeginWork = "05/09/2022 22:31:00",
                dateEndWork = "05/09/2022 06:44:00",
                urlZoom = "",
                isEnableUrl = diffToTime("06/09/2022 22:31:00", "06/09/2022 06:44:00"),
            )
        )
        return currentLessons
    }

    private fun diffToTime(timeBegin: String, timeEnd: String): Boolean {
        val currentTime = Calendar.getInstance().time
        val format = SimpleDateFormat(FORMAT_DATE, Locale.getDefault())
        val time1 = format.parse(timeBegin)
        val time2 = format.parse(timeEnd)
        return currentTime >= time1 && currentTime < time2
    }
}
