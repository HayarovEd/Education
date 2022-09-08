package com.edurda77.education.ui.dashboard

import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.R
import com.edurda77.education.databinding.ItemRvClassBinding
import com.edurda77.education.databinding.ItemWorkBinding
import com.edurda77.education.entity.Work
import com.edurda77.education.utils.dateToTime

class WorkHolderD(private val binding: ItemWorkBinding):
    RecyclerView.ViewHolder(binding.root) {

    fun bind(work: Work) {

        binding.workData.imageLesson.setImageResource(work.picture)
        binding.workData.nameLesson.text = work.nameWork
        val interval = "${dateToTime(work.dateBeginWork)}\n-\n${dateToTime(work.dateEndWork)}"
        binding.timeLesson.text = interval
        binding.goToLesson.isVisible = work.isEnableUrl == true
        binding.radioButton.isChecked= work.isEnableUrl == true
        if(work.isEat == true) {
            binding.workData.cardView.setBackgroundResource(R.drawable.rect_timer)
        }
    }

}