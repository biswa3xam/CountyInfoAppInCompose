package com.biswa.countryinfoapp.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp


val customShape = Shapes(
    extraLarge = RoundedCornerShape(40.dp),
    large = RoundedCornerShape(25.dp),
    small = RoundedCornerShape(10.dp),
    extraSmall = RoundedCornerShape(5.dp),
    medium = CutCornerShape(bottomEndPercent = 10),
)