package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Images for a specific card set, not an individual card.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/sets/set-object#images-hash
 */
@JsonClass(generateAdapter = true)
data class TCGSetImagesDTO(
    @Json(name = "logo")
    val logo: String? = null,
    @Json(name = "symbol")
    val symbol: String? = null,
)
