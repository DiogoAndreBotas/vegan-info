package com.diogobotas.veganinfo.configuration

import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories


@EnableReactiveMongoRepositories
class MongoConfiguration: AbstractReactiveMongoConfiguration() {

    override fun getDatabaseName(): String {
        return "vegan-info"
    }

}