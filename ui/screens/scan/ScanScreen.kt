package com.ecobite.app.ui.screens.scan

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.navigation.NavController
import com.ecobite.app.viewmodel.ScanViewModel

@Composable
fun ScanScreen(navController: NavController) {

    val vm = ScanViewModel()
    var input by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column {

        TextField(value = input, onValueChange = { input = it })

        Button(onClick = {
            val food = vm.fakeScan(input)
            result = "${food.name} - ${food.calories} kcal"
        }) {
            Text("Scan")
        }

        Text(result)
    }
}