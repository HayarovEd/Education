package com.edurda77.education.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.databinding.FragmentDashboardBinding
import com.edurda77.education.entity.HomeWork
import com.edurda77.education.entity.Work
import com.edurda77.education.repositories.Repository
import com.edurda77.education.ui.home.HomeWorkAdapter
import com.edurda77.education.ui.home.WorkAdapter
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(Repository.addWork())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initRecyclerView(work: List<Work>) {
        val recyclerView: RecyclerView = binding.rvWorkD
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerView.adapter = WorkAdapterD(work)

        val position = work.indexOfFirst { it.isEnableUrl==true }
        (recyclerView.layoutManager as LinearLayoutManager).scrollToPosition(position)

    }
}

