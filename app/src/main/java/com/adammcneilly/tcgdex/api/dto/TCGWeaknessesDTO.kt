package com.adammcneilly.tcgdex.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGWeaknessesDTO(
    @Json(name = "type")
    val type: String? = null,
    @Json(name = "value")
    val value: String? = null
)
