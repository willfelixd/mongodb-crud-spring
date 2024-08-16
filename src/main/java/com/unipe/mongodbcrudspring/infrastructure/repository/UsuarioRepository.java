package com.unipe.mongodbcrudspring.infrastructure.repository;

import com.unipe.mongodbcrudspring.infrastructure.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsuarioRepository extends MongoRepository<UsuarioEntity, String> {

}