package com.adammcneilly.tcgdex

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adammcneilly.tcgdex.theme.TCGTheme

@Composable
fun CardGridList(
    displayModels: List<CardDisplayModel>,
    modifier: Modifier = Modifier,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier,
    ) {
        items(displayModels) { displayModel ->
            CardGridListItem(displayModel = displayModel)
        }
    }
}

@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
)
@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
)
@Composable
private fun CardGridListPreview() {
    val displayModels = List(10) { index ->
        CardDisplayModel(
            cardNumber = index,
            name = "Venusaur EX",
            image = ImageResource.Drawable(
                resId = R.drawable.venusaurex,
            ),
        )
    }

    TCGTheme {
        CardGridList(
            displayModels = displayModels,
            modifier = Modifier
                .fillMaxSize(),
        )
    }
}
