package com.unipe.mongodbcrudspring.infrastructure.repository;

import com.unipe.mongodbcrudspring.infrastructure.entity.UsuarioEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;


public interface UsuarioRepository extends MongoRepository<UsuarioEntity, String> {

    UsuarioEntity findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}