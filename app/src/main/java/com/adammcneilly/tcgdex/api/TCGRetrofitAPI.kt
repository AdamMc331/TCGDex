package com.adammcneilly.tcgdex.api

import com.adammcneilly.tcgdex.api.dto.TCGCardListDTO
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

/**
 * Defines all of the data requests to the TCG API.
 *
 * Documentation for the API can be found here: https://docs.pokemontcg.io
 */
interface TCGRetrofitAPI {
    /**
     * Retrieves a list of cards from the TCG API.
     *
     * Docs: https://docs.pokemontcg.io/api-reference/cards/search-cards
     */
    @GET("/v2/cards")
    suspend fun getCards(): TCGCardListDTO

    companion object {
        private const val BASE_URL = "https://api.pokemontcg.io"

        /**
         * Create a default implementation of [TCGRetrofitAPI]. Ideally in the future this will be moved into
         * some sort of dependency management framework.
         */
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
