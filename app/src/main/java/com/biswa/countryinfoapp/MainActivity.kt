package com.biswa.countryinfoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import com.biswa.countryinfoapp.components.CountryInfoAppScaffold
import com.biswa.countryinfoapp.screens.MainScreen
import com.biswa.countryinfoapp.utils.getCountryFromJson
import com.biswa.countryinfoapp.data.Country
import com.biswa.countryinfoapp.ui.theme.CountryInfoAppTheme
import com.biswa.countryinfoapp.ui.theme.CustomTheme

class MainActivity : ComponentActivity() {

    private lateinit var countryInfoList: MutableList<Country>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        countryInfoList = getCountryFromJson(this)

        setContent {
            CustomTheme {
                CountryInfoAppScaffold(countryList = countryInfoList)
            }
        }
    }
}

