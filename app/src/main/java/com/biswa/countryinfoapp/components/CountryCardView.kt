package com.biswa.countryinfoapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.biswa.countryinfoapp.data.CountryInfo

@Composable
fun CountryCardView(countryInfo: CountryInfo) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .padding(10.dp)
            .wrapContentHeight(Alignment.Top)
            .border(1.dp, color = Color.LightGray),
        shadowElevation = 5.dp
    ) {

        Row(modifier = Modifier.fillMaxWidth()) {


            Column(
                modifier = Modifier
                    .fillMaxWidth(0.2f)
                    .weight(0.2f)
            ) {

                Box(
                    modifier = Modifier
                        .width(70.dp)
                        .height(50.dp)
                        .padding(2.dp),
                    contentAlignment = Alignment.Center
                ) {
                    val painterResource: Painter = painterResource(id = countryInfo.flagId)
                    Image(
                        painter = painterResource,
                        contentDescription = "country flag",
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = countryInfo.commonName, modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(2.dp), fontSize = 20.sp, textAlign = TextAlign.Center
                )
                Text(
                    text = countryInfo.nationalCapital, modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(2.dp), fontSize = 15.sp, textAlign = TextAlign.Center
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .weight(0.8f)
            ) {
                Text(
                    text = countryInfo.officialName,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(2.dp)
                )
                Text(
                    text = countryInfo.region,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(2.dp)
                )
                Text(
                    text = countryInfo.subregion,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(2.dp)
                        .fillMaxWidth(1f)

                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    CircularText(text = countryInfo.currencySymbol, modifier = Modifier)

                    Text(
                        text = countryInfo.currencyName,
                        fontSize = 15.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(2.dp)
                            .fillMaxWidth(0.4f)

                    )

                    Column(
                        modifier = Modifier.fillMaxWidth(0.3f),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = countryInfo.mobileCode,
                            fontSize = 12.sp,
                            modifier = Modifier
                        )
                        Text(
                            text = countryInfo.tld,
                            fontSize = 12.sp,
                            modifier = Modifier
                        )
                    }

                }
            }


        }
    }
}