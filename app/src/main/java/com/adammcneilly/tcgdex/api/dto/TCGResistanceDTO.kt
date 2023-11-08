package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Defines the resistances that apply to this card, as is relevant to being attacked by another card.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#resistances-listhash
 */
@JsonClass(generateAdapter = true)
data class TCGResistanceDTO(
    @Json(name = "type")
    val type: String? = null,
    @Json(name = "value")
    val value: String? = null,
)
