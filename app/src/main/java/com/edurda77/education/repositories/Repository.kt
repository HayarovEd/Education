package com.edurda77.education.repositories

import com.edurda77.education.R
import com.edurda77.education.entity.HomeWork
import com.edurda77.education.entity.Work
import com.edurda77.education.utils.FORMAT_DATE
import java.text.SimpleDateFormat
import java.util.*

object Repository {
    private val currentWork = mutableListOf<Work>()
    private val currentHomeWork = mutableListOf<HomeWork>()



    fun addWork(): List<Work> {

        currentWork.add(
            Work(
                picture = R.drawable.ic_stand_up,
                nameWork = "Утренний подъем",
                dateBeginWork = "08/09/2022 06:45:00",
                dateEndWork = "08/09/2022 07:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 06:45:00", "08/09/2022 07:00:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.ic_breakfast,
                nameWork = "Завтрак",
                dateBeginWork = "08/09/2022 07:01:00",
                dateEndWork = "08/09/2022 08:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 07:01:00", "08/09/2022 08:00:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.ic_move,
                nameWork = "Поездка на работу",
                dateBeginWork = "08/09/2022 08:01:00",
                dateEndWork = "08/09/2022 09:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 08:01:00", "08/09/2022 09:00:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.icon_work,
                nameWork = "Работа",
                dateBeginWork = "08/09/2022 09:01:00",
                dateEndWork = "08/09/2022 13:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 09:01:00", "08/09/2022 13:00:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.ic_lounch,
                nameWork = "Обед",
                dateBeginWork = "08/09/2022 13:01:00",
                dateEndWork = "08/09/2022 13:45:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 13:01:00", "08/09/2022 13:45:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.icon_work,
                nameWork = "Работа",
                dateBeginWork = "08/09/2022 13:46:00",
                dateEndWork = "08/09/2022 18:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 13:46:00", "08/09/2022 18:00:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.ic_move,
                nameWork = "Поездка домой",
                dateBeginWork = "08/09/2022 18:01:00",
                dateEndWork = "08/09/2022 19:00:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 18:01:00", "08/09/2022 19:00:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.ic_dinner,
                nameWork = "Ужин",
                dateBeginWork = "08/09/2022 19:01:00",
                dateEndWork = "08/09/2022 19:30:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 19:01:00", "08/09/2022 19:30:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.ic_homework,
                nameWork = "Вечернее время",
                dateBeginWork = "08/09/2022 19:31:00",
                dateEndWork = "08/09/2022 22:30:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 19:31:00", "08/09/2022 22:30:00"),
            )
        )
        currentWork.add(
            Work(
                picture = R.drawable.ic_dream,
                nameWork = "Сон",
                dateBeginWork = "08/09/2022 22:31:00",
                dateEndWork = "08/09/2022 06:44:00",
                urlZoom = "",
                isEnableUrl = diffToTime("08/09/2022 22:31:00", "08/09/2022 06:44:00"),
            )
        )
        return currentWork
    }

    fun addHomeWork(): List<HomeWork> {
        currentHomeWork.add(
            HomeWork(
                picture = R.drawable.ic_comp,
                nameWork = "ДЗ по учебе",
                dateEnd = "14/09/2022 22:00:00",
                content = "Сделать 4 ДЗ"
            ))

        currentHomeWork.add(
            HomeWork(
                picture = R.drawable.ic_st,
                nameWork = "Доделать стеллаж",
                dateEnd = "20/09/2022 00:06:00",
                content = "Сделать полки"
            ))
        currentHomeWork.add(
            HomeWork(
                picture = R.drawable.ic_u,
                nameWork = "Ремонт унитаза",
                dateEnd = "10/09/2022 15:45:00",
                content = "Сменить деталь"
            ))



        return currentHomeWork
    }

    private fun diffToTime(timeBegin: String, timeEnd: String): Boolean {
        val currentTime = Calendar.getInstance().time
        val format = SimpleDateFormat(FORMAT_DATE, Locale.getDefault())
        val time1 = format.parse(timeBegin)
        val time2 = format.parse(timeEnd)
        return currentTime >= time1 && currentTime < time2
    }


}
