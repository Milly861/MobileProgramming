package com.example.app30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descRes: Int
)