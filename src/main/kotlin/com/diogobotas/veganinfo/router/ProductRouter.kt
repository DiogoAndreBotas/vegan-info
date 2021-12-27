package com.diogobotas.veganinfo.router

import com.diogobotas.veganinfo.handler.ProductHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration(proxyBeanMethods = false)
class ProductRouter {

    @Bean
    fun postProductRoute(productHandler: ProductHandler)
        = router {
            accept(MediaType.APPLICATION_JSON).nest {
                POST("/products", productHandler::createProduct)
            }
        }
}