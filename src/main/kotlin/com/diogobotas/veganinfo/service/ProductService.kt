package com.diogobotas.veganinfo.service

import com.diogobotas.veganinfo.model.Product
import com.diogobotas.veganinfo.repository.ProductRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ProductService (
    val productRepository: ProductRepository
) {

    fun createProduct(product: Mono<Product>)
        = product.flatMap { Mono.just(productRepository.save(it)) }
}