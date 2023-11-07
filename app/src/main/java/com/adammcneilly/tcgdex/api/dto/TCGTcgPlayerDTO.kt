package com.adammcneilly.tcgdex.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGTcgPlayerDTO(
    @Json(name = "prices")
    val prices: TCGHolofoilPricesDTO? = TCGHolofoilPricesDTO(),
    @Json(name = "updatedAt")
    val updatedAt: String? = "",
    @Json(name = "url")
    val url: String? = ""
)
