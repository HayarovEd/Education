package com.edurda77.education.ui.home

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.edurda77.education.entity.AllData
import com.edurda77.education.repositories.Repository
import com.edurda77.education.utils.END_DATE
import com.edurda77.education.utils.FORMAT_DATE
import dagger.hilt.android.lifecycle.HiltViewModel
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: Repository): ViewModel() {
    private val _showData= MutableLiveData<AllData>()
    val showData = _showData

    init {
        printDifferenceDateForHours()
    }
    private fun printDifferenceDateForHours() {

        val currentTime = Calendar.getInstance().time
        val endDateDay = END_DATE
        val format1 = SimpleDateFormat(FORMAT_DATE, Locale.getDefault())
        val endDate = format1.parse(endDateDay)
        val different = endDate.time - currentTime.time
        object : CountDownTimer(different, 1000) {


            override fun onTick(millisUntilFinished: Long) {
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val minutesInMilli = secondsInMilli * 60
                val hoursInMilli = minutesInMilli * 60
                val daysInMilli = hoursInMilli * 24

                val elapsedDays = diff / daysInMilli
                diff %= daysInMilli

                val elapsedHours = diff / hoursInMilli
                diff %= hoursInMilli

                val elapsedMinutes = diff / minutesInMilli
                diff %= minutesInMilli


                _showData.postValue( AllData("${elapsedDays}:${elapsedHours}:${elapsedMinutes}"))
            }

            override fun onFinish() {
                _showData.postValue( AllData("Конец тримместра!"))
            }
        }.start()
    }

}