package com.diogobotas.veganinfo.handler

import com.diogobotas.veganinfo.model.Product
import com.diogobotas.veganinfo.service.ProductService
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class ProductHandler (
    val productService: ProductService
) {

    fun createProduct(request: ServerRequest): Mono<ServerResponse> {
        return productService
            .createProduct(request.bodyToMono(Product::class.java))
            .flatMap {
                ServerResponse
                    .status(201)
                    //TODO .created(locationUrl)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromPublisher(it, Product::class.java))
            }
    }
}