package com.biswa.countryinfoapp.utils

import android.content.Context
import com.biswa.countryinfoapp.R
import com.biswa.countryinfoapp.data.Country
import kotlinx.serialization.json.Json


fun getJsonString(context: Context): String {
    val inputStream = context.resources.openRawResource(R.raw.countries)
    return inputStream.bufferedReader().use { it.readText() }
}

private val json = Json { ignoreUnknownKeys = true }

fun getCountryFromJson(context: Context): MutableList<Country> {
    val countyData = getJsonString(context)
    return json.decodeFromString<MutableList<Country>>(countyData)
}