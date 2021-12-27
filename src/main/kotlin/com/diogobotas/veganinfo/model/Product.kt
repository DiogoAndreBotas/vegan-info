package com.diogobotas.veganinfo.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "product")
data class Product (
    val name: String,
    val description: String,
    val brand: String,
    // TODO sort by quantity/appearance
    val ingredients: List<Ingredient>,
    val price: Float,
    val nutritionalValues: NutritionalValues,
    val nutriScore: NutriScore,
    // TODO add image
)