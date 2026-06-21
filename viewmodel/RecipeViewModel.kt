package com.ecobite.app.viewmodel

import androidx.lifecycle.ViewModel
import com.ecobite.app.data.model.Recipe
import com.ecobite.app.data.repository.RecipeRepository

class RecipeViewModel : ViewModel() {

    private val repo = RecipeRepository()

    fun generate(ingredients: List<String>): Recipe {
        return repo.generateRecipe(ingredients)
    }
}