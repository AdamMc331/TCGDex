package com.adammcneilly.tcgdex.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TCGDataDTO(
    @Json(name = "abilities")
    val abilities: List<TCGAbilityDTO>? = listOf(),
    @Json(name = "artist")
    val artist: String? = "",
    @Json(name = "attacks")
    val attacks: List<TCGAttackDTO>? = listOf(),
    @Json(name = "cardmarket")
    val cardMarket: TCGCardMarketDTO? = TCGCardMarketDTO(),
    @Json(name = "convertedRetreatCost")
    val convertedRetreatCost: Int? = 0,
    @Json(name = "evolvesFrom")
    val evolvesFrom: String? = "",
    @Json(name = "evolvesTo")
    val evolvesTo: List<String>? = listOf(),
    @Json(name = "flavorText")
    val flavorText: String? = "",
    @Json(name = "hp")
    val hp: String? = "",
    @Json(name = "id")
    val id: String? = "",
    @Json(name = "images")
    val images: TCGImagesDTO? = TCGImagesDTO(),
    @Json(name = "legalities")
    val legalities: TCGLegalitiesDTO? = TCGLegalitiesDTO(),
    @Json(name = "level")
    val level: String? = "",
    @Json(name = "name")
    val name: String? = "",
    @Json(name = "nationalPokedexNumbers")
    val nationalPokedexNumbers: List<Int>? = listOf(),
    @Json(name = "number")
    val number: String? = "",
    @Json(name = "rarity")
    val rarity: String? = "",
    @Json(name = "regulationMark")
    val regulationMark: String? = "",
    @Json(name = "resistances")
    val resistances: List<TCGResistanceDTO>? = listOf(),
    @Json(name = "retreatCost")
    val retreatCost: List<String>? = listOf(),
    @Json(name = "rules")
    val rules: List<String>? = listOf(),
    @Json(name = "set")
    val `set`: TCGSetDTO? = TCGSetDTO(),
    @Json(name = "subtypes")
    val subtypes: List<String>? = listOf(),
    @Json(name = "supertype")
    val supertype: String? = "",
    @Json(name = "tcgplayer")
    val tcgplayer: TCGTcgPlayerDTO? = TCGTcgPlayerDTO(),
    @Json(name = "types")
    val types: List<String>? = listOf(),
    @Json(name = "weaknesses")
    val weaknesses: List<TCGWeaknessesDTO>? = listOf(),
)
