package com.ecobite.app.ui.screens.recipe

import androidx.compose.runtime.*
import androidx.compose.material3.*
import com.ecobite.app.viewmodel.RecipeViewModel

@Composable
fun RecipeScreen() {

    val vm = RecipeViewModel()
    var result by remember { mutableStateOf("") }

    Column {

        Button(onClick = {
            val recipe = vm.generate(listOf("egg", "rice"))
            result = recipe.title + ": " + recipe.steps
        }) {
            Text("Generate Recipe")
        }

        Text(result)
    }
}