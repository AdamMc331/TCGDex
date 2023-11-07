package com.adammcneilly.tcgdex.api.dto

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.http.GET

interface TCGRetrofitAPI {

    // api.pokemontcg.io/
    @GET("/v2/cards")
    suspend fun getCards(): TCGCardListDTO

    companion object {
        fun defaultInstance(): TCGRetrofitAPI {
            return Retrofit.Builder()
                .baseUrl("https://api.pokemontcg.io")
                .build()
                .create(TCGRetrofitAPI::class.java)
        }
    }
}
