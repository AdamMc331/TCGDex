package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Defines a type that this card is weak to, if relevant.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#weaknesses-listhash
 */
@JsonClass(generateAdapter = true)
data class TCGWeaknessesDTO(
    @Json(name = "type")
    val type: String? = null,
    @Json(name = "value")
    val value: String? = null,
)
