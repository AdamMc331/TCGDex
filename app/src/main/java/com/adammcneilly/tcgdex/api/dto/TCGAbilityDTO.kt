package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the special abilities that can be used by a Pokemon card.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#abilities-listhash
 */
@JsonClass(generateAdapter = true)
data class TCGAbilityDTO(
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "text")
    val text: String? = null,
    @Json(name = "type")
    val type: String? = null,
)
