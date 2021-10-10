package com.diogobotas.veganinfo.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.nio.Buffer

@Document
class Product (
    @Id
    val productId: ObjectId,
    val name: String,
    val description: String,
    val brand: String,
    // TODO introduce by appearance
    val ingredients: List<Ingredient>,
    val price: Float,
    val nutritionalValues: NutritionalValues,
    val nutriScore: NutriScore,
    val image: Buffer
)