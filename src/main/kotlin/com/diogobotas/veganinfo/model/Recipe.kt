package com.diogobotas.veganinfo.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "recipe")
class Recipe (
    val steps: List<String>,
    val products: List<Product>,
    val nutritionalValues: NutritionalValues,
    val servings: Int,
    val cookingTime: Int,
    // TODO add image
)