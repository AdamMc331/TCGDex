package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The legality rulings for a card in competitive play.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#legalities-hash
 */
@JsonClass(generateAdapter = true)
data class TCGLegalitiesDTO(
    @Json(name = "expanded")
    val expanded: String? = null,
    @Json(name = "unlimited")
    val unlimited: String? = null,
)
