package com.adammcneilly.tcgdex.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGCardListDTO(
    @Json(name = "count")
    val count: Int? = 0,
    @Json(name = "data")
    val data: List<TCGDataDTO>? = listOf(),
    @Json(name = "page")
    val page: Int? = 0,
    @Json(name = "pageSize")
    val pageSize: Int? = 0,
    @Json(name = "totalCount")
    val totalCount: Int? = 0
)
