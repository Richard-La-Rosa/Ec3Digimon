package com.example.digimonec3.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofitInstance = Retrofit.Builder()
        .baseUrl("https://digimoncard.io/api-public")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val DigimonInstance = retrofitInstance.create(DigimonInterface::class.java)
}