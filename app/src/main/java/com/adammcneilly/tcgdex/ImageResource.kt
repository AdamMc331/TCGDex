package com.adammcneilly.tcgdex

sealed interface ImageResource {

    data class Remote(
        val url: String,
    ) : ImageResource

    data class Drawable(
        val resId: Int,
    ) : ImageResource
}
