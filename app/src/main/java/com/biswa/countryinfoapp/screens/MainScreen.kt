package com.biswa.countryinfoapp.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.biswa.countryinfoapp.components.CountryCard
import com.biswa.countryinfoapp.ui.theme.CountryInfoAppTheme
import com.biswa.countryinfoapp.data.Country

@Composable
fun MainScreen(countryList: MutableList<Country>, innerPaddingValues: PaddingValues) {

        Surface(modifier = Modifier.fillMaxSize().padding(innerPaddingValues),
            color = MaterialTheme.colorScheme.surface) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(countryList) {
                    CountryCard(info = it)
                }
            }

        }

}