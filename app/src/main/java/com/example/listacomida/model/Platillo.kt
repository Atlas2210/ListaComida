package com.example.listacomida.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResId: Int,
    val precio: Double,
    val oferta: String
)
