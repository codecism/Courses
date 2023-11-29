package com.eddie.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val titleResourceId: Int,
    val courseNumber: Int,
    @DrawableRes val imageResourceId: Int,
)
