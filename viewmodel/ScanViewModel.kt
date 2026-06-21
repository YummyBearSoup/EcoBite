package com.ecobite.app.viewmodel

import androidx.lifecycle.ViewModel
import com.ecobite.app.data.model.FoodItem

class ScanViewModel : ViewModel() {

    fun fakeScan(input: String): FoodItem {
        return when (input.lowercase()) {
            "egg" -> FoodItem("Egg", 5, 70)
            "rice" -> FoodItem("Rice", 365, 200)
            else -> FoodItem(input, 3, 50)
        }
    }
}