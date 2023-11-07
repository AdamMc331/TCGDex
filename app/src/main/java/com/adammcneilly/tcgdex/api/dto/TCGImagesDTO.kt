package com.adammcneilly.tcgdex.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGImagesDTO(
    @Json(name = "large")
    val large: String? = null,
    @Json(name = "small")
    val small: String? = null
)
