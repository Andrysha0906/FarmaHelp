package com.example.farmahelp1.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.farmahelp1.watch.MainActivityWatch
import com.example.farmahelp1.search.MainActivitySearch
import com.example.farmahelp1.addPill.MainActivityAddPill
import com.example.farmahelp1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.buttonAddPills.setOnClickListener {
            val intent = Intent(requireContext(), MainActivityAddPill::class.java)
            startActivity(intent)
        }
        binding.buttonMedicinePills.setOnClickListener{
            val intent = Intent(requireContext(), MainActivitySearch::class.java)
            startActivity(intent)
        }
        binding.buttonWigetTime.setOnClickListener{
            val intent = Intent(requireContext(), MainActivityWatch::class.java)
            startActivity(intent)
        }
        val root: View = binding.root
        return root
    }
}