package com.diogobotas.veganinfo.repository

import com.diogobotas.veganinfo.model.Product
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: ReactiveMongoRepository<Product, ObjectId>
