package com.ecobite.app.ui.screens.inventory

import androidx.compose.runtime.*
import androidx.compose.material3.*
import com.ecobite.app.viewmodel.InventoryViewModel

@Composable
fun InventoryScreen() {

    val vm = InventoryViewModel()
    val foods = vm.getFoods()

    Column {
        Text("Inventory")

        foods.forEach {
            Text("${it.name} - expires in ${it.expiryDays} days")
        }
    }
}