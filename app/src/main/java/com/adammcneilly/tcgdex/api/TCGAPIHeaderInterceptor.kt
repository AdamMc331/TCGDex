package com.adammcneilly.tcgdex.api

import com.adammcneilly.tcgdex.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

/**
 * An implementation fo an [Interceptor] that adds the [BuildConfig.tcgApiKey] as a header
 * to every request.
 */
class TCGAPIHeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()

        requestBuilder.addHeader(
            name = "X-Api-Key",
            value = BuildConfig.tcgApiKey,
        )

        return chain.proceed(requestBuilder.build())
    }
}
