package com.ecobite.app.ui.screens.home

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ecobite.app.navigation.Routes

@Composable
fun HomeScreen(navController: NavController) {

    Column {
        Text("EcoBite")

        Button(onClick = { navController.navigate(Routes.SCAN) }) {
            Text("Scan Food")
        }

        Button(onClick = { navController.navigate(Routes.INVENTORY) }) {
            Text("Inventory")
        }

        Button(onClick = { navController.navigate(Routes.RECIPE) }) {
            Text("Recipes")
        }
    }
}