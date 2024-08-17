package com.unipe.mongodbcrudspring;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Java, Spring Boot e Mongodb ", version = "1", description = "API desenvolvida para avaliação do Módulo: PROGRAMAÇÃO WEB BACK-END I (Java)" +
        " com o Prof.: Rodrigo Fujioka"))
public class MongodbCrudSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbCrudSpringApplication.class, args);
    }

}
