package com.ecobite.app.viewmodel

import androidx.lifecycle.ViewModel
import com.ecobite.app.data.model.FoodItem

class SharedViewModel : ViewModel() {

    val selectedFoods = mutableListOf<FoodItem>()
}