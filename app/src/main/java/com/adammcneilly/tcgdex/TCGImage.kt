package com.adammcneilly.tcgdex

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage

@Composable
fun TCGImage(
    image: ImageResource,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
) {
    when (image) {
        is ImageResource.Drawable -> {
            Image(
                painter = painterResource(id = image.resId),
                contentDescription = contentDescription,
                modifier = modifier,
                contentScale = contentScale,
            )
        }

        is ImageResource.Remote -> {
            AsyncImage(
                model = image.url,
                contentDescription = contentDescription,
                modifier = modifier,
                contentScale = contentScale,
            )
        }
    }
}
