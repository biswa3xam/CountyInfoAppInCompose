package com.biswa.countryinfoapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.AsyncImage
import com.biswa.countryinfoapp.data.Country

@Composable
fun CountryCardWithConstraintLayout(countryInfo: Country) {
    ConstraintLayout(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(2.dp)
    ) {

        val (flag, commonName, capital, officialName, region, subregion, currencySymbol, currencyName, mobileCode, tld) = createRefs()

        AsyncImage(model = countryInfo.flags?.png, contentDescription = countryInfo.flag,
            modifier = Modifier
                .fillMaxWidth(0.35f)
                .height(70.dp)
                .padding(2.dp)
                .constrainAs(flag) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )

        countryInfo.name?.common?.let {
            Text(
                text = it, modifier = Modifier
                    .padding(2.dp)
                    .constrainAs(commonName) {
                        top.linkTo(flag.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(flag.end)
                    }, style = MaterialTheme.typography.bodyLarge, textAlign = TextAlign.Center
            )
        }

        countryInfo.capital?.get(0)?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.titleSmall,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .padding(2.dp)
                    .constrainAs(capital) {
                        top.linkTo(commonName.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(flag.end)
                    }
            )
        }

        countryInfo.name?.official?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .constrainAs(officialName) {
                        top.linkTo(parent.top)
                        start.linkTo(flag.end)
                        end.linkTo(parent.end)
                    }
                    .padding(2.dp)
                    .fillMaxWidth(0.65f),

                )
        }
        countryInfo.region?.let {
            Text(
                text = it, modifier = Modifier
                    .constrainAs(region) {
                        top.linkTo(officialName.bottom)
                        start.linkTo(flag.end)
                        end.linkTo(parent.end)
                    }
                    .padding(2.dp)
                    .fillMaxWidth(0.8f), fontSize = 15.sp, textAlign = TextAlign.Center
            )
        }
        countryInfo.subregion?.let {
            Text(
                text = it, modifier = Modifier
                    .constrainAs(subregion) {
                        top.linkTo(region.bottom)
                        start.linkTo(flag.end)
                        end.linkTo(parent.end)
                    }
                    .padding(2.dp)
                    .fillMaxWidth(0.8f), fontSize = 12.sp, textAlign = TextAlign.Center
            )
        }

        countryInfo.currencies?.entries?.first()?.value?.symbol?.let {
            CircularText(
                text = it,
                modifier = Modifier.constrainAs(currencySymbol) {
                    start.linkTo(flag.end, margin = 30.dp)
                    bottom.linkTo(parent.bottom, margin = 8.dp)
                })
        }

        countryInfo.currencies?.entries?.first()?.value?.name?.let {
            Text(
                text = it, modifier = Modifier
                    .constrainAs(currencyName) {
                        top.linkTo(subregion.bottom)
                        start.linkTo(currencySymbol.end, 12.dp)
                        end.linkTo(mobileCode.start)
                        bottom.linkTo(parent.bottom, 5.dp)
                    }, textAlign = TextAlign.Left
            )
        }


        Text(
            text = countryInfo.idd?.root + "" + countryInfo.idd?.suffixes?.get(0),
            modifier = Modifier
                .constrainAs(mobileCode) {
                    top.linkTo(subregion.bottom)
                    end.linkTo(parent.end)
                }
                .padding(2.dp)
                .width(50.dp)
        )

        countryInfo.tld?.let {
            Text(
                text = it.get(0), modifier = Modifier
                    .constrainAs(tld) {
                        top.linkTo(mobileCode.bottom)
                        end.linkTo(parent.end)
                    }
                    .padding(2.dp)
                    .width(50.dp)
            )
        }
    }
}
