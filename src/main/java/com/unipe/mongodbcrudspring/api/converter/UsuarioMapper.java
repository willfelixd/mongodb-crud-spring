package com.unipe.mongodbcrudspring.api.converter;

import com.unipe.mongodbcrudspring.api.response.UsuarioResponseDTO;
import com.unipe.mongodbcrudspring.infrastructure.entity.EnderecoEntity;
import com.unipe.mongodbcrudspring.infrastructure.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", source = "usuario.id")
    @Mapping(target = "nome", source = "usuario.nome")
    @Mapping(target = "documento", source = "usuario.documento")
    @Mapping(target = "endereco", source = "enderecoEntity")
    UsuarioResponseDTO paraUsuarioResponseDTO(UsuarioEntity usuario, EnderecoEntity enderecoEntity);

}
