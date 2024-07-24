package com.biswa.countryinfoapp.data

import kotlinx.serialization.Serializable

@Serializable
data class Bre(
    val common: String? = null,
    val official: String? = null
)