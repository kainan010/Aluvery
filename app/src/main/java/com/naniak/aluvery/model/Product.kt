package com.naniak.aluvery.model

import android.content.ClipDescription
import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product (
    val name: String,
    val price: BigDecimal,
    val image: String? = null,
    val description: String? = null
)
