package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Defines the TCG Player prices for a holofoil card.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#tcgplayer-hash
 */
@JsonClass(generateAdapter = true)
data class TCGPlayerHolofoilCardMarketDTO(
    @Json(name = "prices")
    val prices: TCGPlayerHolofoilPricesDTO? = TCGPlayerHolofoilPricesDTO(),
    @Json(name = "updatedAt")
    val updatedAt: String? = "",
    @Json(name = "url")
    val url: String? = "",
)
