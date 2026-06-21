package com.ecobite.app.viewmodel

import androidx.lifecycle.ViewModel
import com.ecobite.app.data.repository.FoodRepository

class InventoryViewModel : ViewModel() {

    private val repo = FoodRepository()

    fun getFoods() = repo.getFoods()
}