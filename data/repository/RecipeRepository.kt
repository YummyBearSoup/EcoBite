package com.ecobite.app.data.repository

import com.ecobite.app.data.model.Recipe

class RecipeRepository {

    fun generateRecipe(ingredients: List<String>): Recipe {

        return when {
            ingredients.contains("egg") && ingredients.contains("rice") ->
                Recipe("Egg Fried Rice", ingredients, "Cook egg, mix with rice, stir fry.")

            ingredients.contains("banana") ->
                Recipe("Banana Smoothie", ingredients, "Blend banana with milk.")

            else ->
                Recipe("Simple Salad", ingredients, "Mix all ingredients together.")
        }
    }
}