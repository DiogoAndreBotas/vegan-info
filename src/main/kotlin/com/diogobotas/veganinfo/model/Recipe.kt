package com.diogobotas.veganinfo.model

import org.springframework.data.mongodb.core.mapping.Document
import java.nio.Buffer

@Document
class Recipe (
    val steps: List<String>,
    val products: List<Product>,
    val nutritionalValues: NutritionalValues,
    val servings: Int,
    val cookingTime: Int,
    val image: Buffer
)