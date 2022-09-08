package com.edurda77.education.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.edurda77.education.databinding.FragmentHomeBinding
import com.edurda77.education.entity.HomeWork
import com.edurda77.education.entity.Work
import com.edurda77.education.repositories.Repository.addHomeWork
import com.edurda77.education.repositories.Repository.addWork
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings

@AndroidEntryPoint
@WithFragmentBindings
class HomeFragment : Fragment() {
    private val viewModel by viewModels<HomeViewModel>()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.printDifferenceDateForHours()
        viewModel.showData.observe(viewLifecycleOwner) {
            binding.timerData.count.text = it.countDownData
        }
        binding.classesToday.text = "Сегодня ${addWork().size} дел"
        initRecyclerView(addWork())
        initRecyclerView2(addHomeWork())
    }

    private fun initRecyclerView2(homeWork: List<HomeWork>) {
        val recyclerView: RecyclerView = binding.rvHomeWork
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL, false
        )
        recyclerView.adapter = HomeWorkAdapter(homeWork)
    }

    private fun initRecyclerView(work: List<Work>) {
        val recyclerView: RecyclerView = binding.rvClasses
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL, false
        )
        recyclerView.adapter = WorkAdapter(work)

        val position = work.indexOfFirst { it.isEnableUrl==true }
        (recyclerView.layoutManager as LinearLayoutManager).scrollToPosition(position)

    }

}