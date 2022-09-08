package com.edurda77.education.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.databinding.ItemWorkBinding
import com.edurda77.education.entity.Work

class WorkAdapterD(
    private val list: List<Work>
) : RecyclerView.Adapter<WorkHolderD>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkHolderD {
        val inflater = LayoutInflater.from(parent.context)
        return WorkHolderD(ItemWorkBinding.inflate(inflater,parent,false))
    }

    override fun onBindViewHolder(holder: WorkHolderD, position: Int) {
        val workList = list[position]
        holder.bind(workList)
    }

    override fun getItemCount(): Int = list.size

}
