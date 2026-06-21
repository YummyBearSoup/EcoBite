package com.ecobite.app

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ecobite.app.navigation.AppNavGraph

@Composable
fun EcoBiteApp() {
    val navController = rememberNavController()

    MaterialTheme {
        AppNavGraph(navController)
    }
}