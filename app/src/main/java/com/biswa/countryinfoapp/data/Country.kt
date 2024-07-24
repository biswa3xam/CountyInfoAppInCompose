package com.biswa.countryinfoapp.data

import com.codetutor.countryinfoapp.data.CoatOfArms
import com.codetutor.countryinfoapp.data.Currency
import com.codetutor.countryinfoapp.data.Demonyms
import com.codetutor.countryinfoapp.data.Flags
import com.codetutor.countryinfoapp.data.Idd
import com.codetutor.countryinfoapp.data.Languages
import com.codetutor.countryinfoapp.data.Maps
import com.codetutor.countryinfoapp.data.Name
import com.codetutor.countryinfoapp.data.Translations
import kotlinx.serialization.Serializable

@Serializable
data class Country(
    val altSpellings: List<String>? = null,
    val area: Double? = null,
    val capital: List<String>? = null,
    val capitalInfo: CapitalInfo? = null,
    val car: Car? = null,
    val cca2: String? = null,
    val cca3: String? = null,
    val ccn3: String? = null,
    val coatOfArms: CoatOfArms? = null,
    val continents: List<String>? = null,
    val currencies: Map<String, Currency>? = null,
    val demonyms: Demonyms? = null,
    val flag: String? = null,
    val flags: Flags? = null,
    val idd: Idd? = null,
    val independent: Boolean? = null,
    val landlocked: Boolean? = null,
    val languages: Languages? = null,
    val latlng: List<Double>? = null,
    val maps: Maps? = null,
    val name: Name? = null,
    val population: Int? = null,
    val region: String? = null,
    val startOfWeek: String? = null,
    val status: String? = null,
    val subregion: String? = null,
    val timezones: List<String>? = null,
    val tld: List<String>? = null,
    val translations: Translations? = null,
    val unMember: Boolean? = null
)