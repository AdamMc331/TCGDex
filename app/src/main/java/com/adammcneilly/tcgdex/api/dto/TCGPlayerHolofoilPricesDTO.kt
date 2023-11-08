package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the holofoil prices of a card from TCG Player API.
 *
 * Docs: https://docs.pokemontcg.io/api-reference/cards/card-object#tcgplayer-hash
 */
@JsonClass(generateAdapter = true)
data class TCGPlayerHolofoilPricesDTO(
    @Json(name = "holofoil")
    val holofoil: TCGCardPricesDTO? = null,
    @Json(name = "normal")
    val normal: TCGCardPricesDTO? = null,
    @Json(name = "reverseHolofoil")
    val reverseHolofoil: TCGCardPricesDTO? = null,
    @Json(name = "1stEditionHolofoil")
    val firstEditionHolofoil: TCGCardPricesDTO? = null,
    @Json(name = "unlimitedHolofoil")
    val unlimitedHolofoil: TCGCardPricesDTO? = null,
)
