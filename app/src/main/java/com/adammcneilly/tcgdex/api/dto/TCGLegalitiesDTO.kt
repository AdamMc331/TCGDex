package com.adammcneilly.tcgdex.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGLegalitiesDTO(
    @Json(name = "expanded")
    val expanded: String? = null,
    @Json(name = "unlimited")
    val unlimited: String? = null
)
