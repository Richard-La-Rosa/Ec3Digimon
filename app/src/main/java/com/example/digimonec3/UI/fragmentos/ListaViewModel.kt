package com.example.digimonec3.UI.fragmentos

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.digimonec3.model.Digimons
import com.example.digimonec3.model.getData

class ListaViewModel : ViewModel(){
    val digimons: MutableLiveData<List<Digimons>> = MutableLiveData<List<Digimons>>()

    fun getDigimonts(){
        val allDigimons = getData()
        digimons.value = allDigimons
    }
}