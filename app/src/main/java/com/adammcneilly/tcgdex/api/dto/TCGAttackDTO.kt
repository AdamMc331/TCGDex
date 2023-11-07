package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGAttackDTO(
    @Json(name = "convertedEnergyCost")
    val convertedEnergyCost: Int? = null,
    @Json(name = "cost")
    val cost: List<String?>? = null,
    @Json(name = "damage")
    val damage: String? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "text")
    val text: String? = null,
)
