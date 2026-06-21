package com.ecobite.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.ecobite.app.ui.screens.home.HomeScreen
import com.ecobite.app.ui.screens.scan.ScanScreen
import com.ecobite.app.ui.screens.inventory.InventoryScreen
import com.ecobite.app.ui.screens.recipe.RecipeScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Routes.HOME) {

        composable(Routes.HOME) { HomeScreen(navController) }
        composable(Routes.SCAN) { ScanScreen(navController) }
        composable(Routes.INVENTORY) { InventoryScreen(navController) }
        composable(Routes.RECIPE) { RecipeScreen(navController) }
    }
}