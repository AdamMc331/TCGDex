package com.adammcneilly.tcgdex.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGMarketPricesDTO(
    @Json(name = "averageSellPrice")
    val averageSellPrice: Double? = null,
    @Json(name = "avg1")
    val avg1: Double? = null,
    @Json(name = "avg30")
    val avg30: Double? = null,
    @Json(name = "avg7")
    val avg7: Double? = null,
    @Json(name = "germanProLow")
    val germanProLow: Double? = null,
    @Json(name = "lowPrice")
    val lowPrice: Double? = null,
    @Json(name = "lowPriceExPlus")
    val lowPriceExPlus: Double? = null,
    @Json(name = "reverseHoloAvg1")
    val reverseHoloAvg1: Double? = null,
    @Json(name = "reverseHoloAvg30")
    val reverseHoloAvg30: Double? = null,
    @Json(name = "reverseHoloAvg7")
    val reverseHoloAvg7: Double? = null,
    @Json(name = "reverseHoloLow")
    val reverseHoloLow: Double? = null,
    @Json(name = "reverseHoloSell")
    val reverseHoloSell: Double? = null,
    @Json(name = "reverseHoloTrend")
    val reverseHoloTrend: Double? = null,
    @Json(name = "suggestedPrice")
    val suggestedPrice: Double? = null,
    @Json(name = "trendPrice")
    val trendPrice: Double? = null
)
