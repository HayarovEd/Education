package com.edurda77.education.ui.home

import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.databinding.ItemRvClassBinding
import com.edurda77.education.entity.Work
import com.edurda77.education.utils.dateToTime

class WorkHolder(private val binding: ItemRvClassBinding):
    RecyclerView.ViewHolder(binding.root) {

    fun bind(work: Work) {

        binding.imageLesson.setImageResource(work.picture)
        binding.nameLesson.text = work.nameWork
        val interval = "${dateToTime(work.dateBeginWork)}\n-\n${dateToTime(work.dateEndWork)}"
        binding.timeLesson.text = interval
        binding.goToLesson.isVisible = work.isEnableUrl == true
    }

}