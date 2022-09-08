package com.edurda77.education.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.databinding.ItemRvClassBinding
import com.edurda77.education.databinding.ItemRvHomeworkBinding
import com.edurda77.education.entity.HomeWork
import com.edurda77.education.entity.Work

class HomeWorkAdapter(
    private val list: List<HomeWork>
) : RecyclerView.Adapter<HomeWorkHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeWorkHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HomeWorkHolder(ItemRvHomeworkBinding.inflate(inflater,parent,false))
    }

    override fun onBindViewHolder(holder: HomeWorkHolder, position: Int) {
        val workList = list[position]
        holder.bind(workList)
    }

    override fun getItemCount(): Int = list.size

}
