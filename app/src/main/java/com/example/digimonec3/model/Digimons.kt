package com.example.digimonec3.model

import com.google.gson.annotations.SerializedName

data class Digimons(
    val name: String,
    @SerializedName("cardnumber")
    val codigo: String,
    val precio: Double,
    val proveedor: String,
    val cantidad: Int,
    val isFavorite: Boolean = false,
    val imgURL: String = ""
)
fun getData(): List<Digimons> = listOf (

    Digimons("OTAMAMON", "BT4-007",  5.00, "Kantocards", 10,true,"https://kantocards.com/cdn/shop/products/BT4-038_c3ec7dfe-b67d-49a8-87f5-87e013bb12dc_540x.png?v=1634334376"),
    Digimons("OTAMAMON", "BT4-007",  5.00, "Kantocards", 10,false),
    Digimons("OTAMAMON", "BT4-007",  5.00, "Kantocards", 10,false),
    Digimons("OTAMAMON", "BT4-007",  5.00, "Kantocards", 10,false),
    Digimons("OTAMAMON", "BT4-007",  5.00, "Kantocards", 10,false),
)
