package com.adammcneilly.tcgdex.api

import com.adammcneilly.tcgdex.api.dto.TCGCardListDTO
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface TCGRetrofitAPI {
    @GET("/v2/cards")
    suspend fun getCards(): TCGCardListDTO

    companion object {
        private const val BASE_URL = "https://api.pokemontcg.io"

        fun defaultInstance(): TCGRetrofitAPI {
            val headerInterceptor = TCGAPIHeaderInterceptor()

            val loggingInterceptor =
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }

            val client =
                OkHttpClient.Builder()
                    .addInterceptor(headerInterceptor)
                    .addInterceptor(loggingInterceptor)
                    .build()

            val moshi = Moshi.Builder().build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .client(client)
                .build()
                .create(TCGRetrofitAPI::class.java)
        }
    }
}
