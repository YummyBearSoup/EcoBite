package com.ecobite.app.data.local

import com.ecobite.app.data.model.FoodItem

object FakeDatabase {

    val foodList = mutableListOf(
        FoodItem("Egg", 5, 70),
        FoodItem("Rice", 365, 200)
    )

    fun addFood(item: FoodItem) {
        foodList.add(item)
    }

    fun getAll(): List<FoodItem> = foodList
}