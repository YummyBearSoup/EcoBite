package com.ecobite.app.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.ecobite.app.data.model.FoodItem

@Composable
fun FoodCard(food: FoodItem) {
    Card {
        Text(food.name)
        Text("Calories: ${food.calories}")
    }
}