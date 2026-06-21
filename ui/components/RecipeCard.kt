package com.ecobite.app.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.ecobite.app.data.model.Recipe

@Composable
fun RecipeCard(recipe: Recipe) {
    Card {
        Text(recipe.title)
        Text(recipe.steps)
    }
}