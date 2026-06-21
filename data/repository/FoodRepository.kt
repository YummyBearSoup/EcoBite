package com.ecobite.app.data.repository

import com.ecobite.app.data.local.FakeDatabase
import com.ecobite.app.data.model.FoodItem

class FoodRepository {

    fun getFoods(): List<FoodItem> {
        return FakeDatabase.getAll()
    }

    fun addFood(item: FoodItem) {
        FakeDatabase.addFood(item)
    }
}