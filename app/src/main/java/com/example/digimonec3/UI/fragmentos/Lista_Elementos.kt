package com.example.digimonec3.UI.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digimonec3.databinding.FragmentListaElementosBinding

class Lista_Elementos : Fragment() {
    private lateinit var  binding: FragmentListaElementosBinding

    private lateinit var  viewModel: ListaViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[ListaViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaElementosBinding.inflate(inflater,container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RVDigimonAdapter(listOf())
        binding.rvDigimons.adapter = adapter
        binding.rvDigimons.layoutManager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)

        viewModel.digimons.observe(requireActivity()){digimons->
            adapter.digimons= digimons
            adapter.notifyDataSetChanged()

        }
        viewModel.getDigimonts()
    }
}