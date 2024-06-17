package com.kupreychik.zulu_boot.repository.mongo;

import com.kupreychik.zulu_boot.model.nosql.ConfigMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigMongoRepository extends MongoRepository<ConfigMongo, String> {
}
