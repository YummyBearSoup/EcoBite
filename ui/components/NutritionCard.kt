package com.ecobite.app.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.ecobite.app.data.model.Nutrition

@Composable
fun NutritionCard(nutrition: Nutrition) {
    Card {
        Text("Calories: ${nutrition.calories}")
        Text("Protein: ${nutrition.protein}")
        Text("Fat: ${nutrition.fat}")
    }
}