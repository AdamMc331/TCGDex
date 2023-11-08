package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the market prices for a given card on TCG Player.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#cardmarket-hash
 */
@JsonClass(generateAdapter = true)
data class TCGCardMarketDTO(
    @Json(name = "prices")
    val prices: TCGCardMarketPricesDTO? = null,
    @Json(name = "updatedAt")
    val updatedAt: String? = null,
    @Json(name = "url")
    val url: String? = null,
)
