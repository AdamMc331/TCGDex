package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGSetImagesDTO(
    @Json(name = "logo")
    val logo: String? = null,
    @Json(name = "symbol")
    val symbol: String? = null,
)
