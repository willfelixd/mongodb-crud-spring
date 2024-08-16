package com.unipe.mongodbcrudspring.infrastructure.repository;

import com.unipe.mongodbcrudspring.infrastructure.entity.EnderecoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnderecoRepository extends MongoRepository<EnderecoEntity, String> {
}
