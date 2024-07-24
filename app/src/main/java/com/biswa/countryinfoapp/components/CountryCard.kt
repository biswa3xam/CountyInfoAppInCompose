package com.biswa.countryinfoapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.biswa.countryinfoapp.data.Country

@Composable
fun CountryCard(info: Country) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(5.dp)
            .wrapContentHeight(Alignment.Top),
        shadowElevation = 2.dp,
        color = MaterialTheme.colorScheme.surfaceVariant,
        border = BorderStroke(1.dp,MaterialTheme.colorScheme.outline),
        shape = MaterialTheme.shapes.medium
    ) {
        CountryCardWithConstraintLayout(countryInfo = info)
    }
}