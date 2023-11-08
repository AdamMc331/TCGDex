package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the various attacks that can be used by a specific Pokemon card, if relevant.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#attacks-listhash
 */
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
