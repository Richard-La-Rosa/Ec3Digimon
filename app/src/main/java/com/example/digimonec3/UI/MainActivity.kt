package com.example.digimonec3.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.digimonec3.R
import com.example.digimonec3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragmentView =  supportFragmentManager.findFragmentById(R.id.fcv_navigation) as NavHostFragment
        val navController = fragmentView.navController
        binding.bnvDigimon.setupWithNavController (navController)
}}