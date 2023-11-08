package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Image information for a specific card entity.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#images-hash
 */
@JsonClass(generateAdapter = true)
data class TCGCardImagesDTO(
    @Json(name = "large")
    val large: String? = null,
    @Json(name = "small")
    val small: String? = null,
)
