package com.example.digimonec3.UI.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.digimonec3.databinding.FragmentFavoritoBinding


class Favorito : Fragment() {
    private lateinit var  binding: FragmentFavoritoBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoritoBinding.inflate(inflater,container, false)
        return binding.root
    }


}