package com.ecobite.app.data.model

data class FoodItem(
    val name: String,
    val expiryDays: Int,
    val calories: Int = 0
)