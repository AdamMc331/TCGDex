package com.adammcneilly.tcgdex

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.tcgdex.theme.TCGTheme

@Composable
fun CardGridListItem(
    displayModel: CardDisplayModel,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .aspectRatio(0.75F)
            .clip(RoundedCornerShape(2.dp)),
    ) {
        TCGImage(
            image = displayModel.image,
            contentDescription = displayModel.name,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxSize(),
        )

        Text(
            text = "#${displayModel.cardNumber} – ${displayModel.name}",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(
                    bottom = 48.dp,
                )
                .background(
                    color = MaterialTheme.colorScheme.background.copy(
                        alpha = 0.75F,
                    ),
                ),
        )
    }
}

@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
private fun CardGridListItemPreview() {
    val venusaur = CardDisplayModel(
        cardNumber = 1,
        name = "Venusaur EX",
        image = ImageResource.Drawable(
            resId = R.drawable.venusaurex,
        )
    )

    TCGTheme {
        CardGridListItem(venusaur)
    }
}
