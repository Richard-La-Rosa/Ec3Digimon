package com.example.digimonec3.data.repository

import com.example.digimonec3.data.retrofit.RetrofitHelper
import com.example.digimonec3.model.Digimons

class DigimonRepository {

    fun getDimongs(): List<Digimons> {
        val response = RetrofitHelper.DigimonInstance.getAllDigimons()
        return response.digimons
    }
}