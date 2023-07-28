package com.example.digimonec3.data.retrofit

import com.example.digimonec3.data.response.DigimonList
import retrofit2.http.GET

interface DigimonInterface {
    @GET("getAllCards.php?sort=name&series=Digimon%20Card%20Game&sortdirection=asc")
    fun getAllDigimons(): DigimonList

    @GET()
    fun getallimg(): DigimonList
}
