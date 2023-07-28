package com.example.digimonec3.UI.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.digimonec3.R
import com.example.digimonec3.databinding.FragmentFavoritoBinding
import com.example.digimonec3.databinding.FragmentInfoBinding


class Info : Fragment() {
    private lateinit var  binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(inflater,container, false)
        return binding.root
    }
}