package com.edurda77.education.ui.home

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.databinding.ItemRvClassBinding
import com.edurda77.education.databinding.ItemRvHomeworkBinding
import com.edurda77.education.entity.HomeWork
import com.edurda77.education.entity.Work
import com.edurda77.education.utils.calcToLeft
import com.edurda77.education.utils.dateToTime

class HomeWorkHolder(private val binding: ItemRvHomeworkBinding):
    RecyclerView.ViewHolder(binding.root) {

    @SuppressLint("SetTextI18n")
    fun bind(homeWork: HomeWork) {

        binding.imageLesson.setImageResource(homeWork.picture)
        binding.titleHomework.text = homeWork.nameWork
        binding.timeLeft.text = "Осталось ${calcToLeft(homeWork.dateEnd)} дня"
        if (calcToLeft(homeWork.dateEnd)<3) {
            binding.timeLeft.setTextColor(Color.RED)
        }
        binding.contentHomework.text=homeWork.content
    }

}