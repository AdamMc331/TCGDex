package com.adammcneilly.tcgdex.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGSetDTO(
    @Json(name = "id")
    val id: String? = "",
    @Json(name = "images")
    val images: TCGSetImagesDTO? = TCGSetImagesDTO(),
    @Json(name = "legalities")
    val legalities: TCGLegalitiesDTO? = TCGLegalitiesDTO(),
    @Json(name = "name")
    val name: String? = "",
    @Json(name = "printedTotal")
    val printedTotal: Int? = 0,
    @Json(name = "ptcgoCode")
    val ptcgoCode: String? = "",
    @Json(name = "releaseDate")
    val releaseDate: String? = "",
    @Json(name = "series")
    val series: String? = "",
    @Json(name = "total")
    val total: Int? = 0,
    @Json(name = "updatedAt")
    val updatedAt: String? = ""
)
