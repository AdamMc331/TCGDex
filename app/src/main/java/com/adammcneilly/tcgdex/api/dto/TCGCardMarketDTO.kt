package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGCardMarketDTO(
    @Json(name = "prices")
    val prices: TCGMarketPricesDTO? = null,
    @Json(name = "updatedAt")
    val updatedAt: String? = null,
    @Json(name = "url")
    val url: String? = null,
)
