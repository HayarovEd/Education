package com.edurda77.education.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.databinding.ItemRvClassBinding
import com.edurda77.education.entity.Work

class WorkAdapter(
    private val list: List<Work>
) : RecyclerView.Adapter<WorkHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkHolder {
        val inflater = LayoutInflater.from(parent.context)
        return WorkHolder(ItemRvClassBinding.inflate(inflater,parent,false))
    }

    override fun onBindViewHolder(holder: WorkHolder, position: Int) {
        val workList = list[position]
        holder.bind(workList)
    }

    override fun getItemCount(): Int = list.size

}
