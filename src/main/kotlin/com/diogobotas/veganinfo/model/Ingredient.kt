package com.diogobotas.veganinfo.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "ingredient")
class Ingredient (
    val name: String,
    val description: String,
    // TODO add image
)