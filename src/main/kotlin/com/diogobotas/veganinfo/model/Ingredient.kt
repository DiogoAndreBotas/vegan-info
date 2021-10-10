package com.diogobotas.veganinfo.model

import org.springframework.data.mongodb.core.mapping.Document
import java.nio.Buffer

@Document
class Ingredient (
    val name: String,
    val description: String,
    val image: Buffer
)