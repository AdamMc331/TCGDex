package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Collection of prices for a specific card. Likely comes from the TCG Player API.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#tcgplayer-hash
 */
@JsonClass(generateAdapter = true)
data class TCGCardPricesDTO(
    @Json(name = "directLow")
    val directLow: Double? = null,
    @Json(name = "high")
    val high: Double? = null,
    @Json(name = "low")
    val low: Double? = null,
    @Json(name = "market")
    val market: Double? = null,
    @Json(name = "mid")
    val mid: Double? = null,
)
