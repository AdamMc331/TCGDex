package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGAbilityDTO(
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "text")
    val text: String? = null,
    @Json(name = "type")
    val type: String? = null,
)
