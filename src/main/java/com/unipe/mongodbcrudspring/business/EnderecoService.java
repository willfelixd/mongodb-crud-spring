package com.unipe.mongodbcrudspring.business;

import com.unipe.mongodbcrudspring.api.converter.UsuarioConverter;
import com.unipe.mongodbcrudspring.api.converter.UsuarioMapper;
import com.unipe.mongodbcrudspring.api.request.UsuarioRequestDTO;
import com.unipe.mongodbcrudspring.api.response.UsuarioResponseDTO;
import com.unipe.mongodbcrudspring.infrastructure.entity.EnderecoEntity;
import com.unipe.mongodbcrudspring.infrastructure.entity.UsuarioEntity;
import com.unipe.mongodbcrudspring.infrastructure.exceptions.BusinessException;
import com.unipe.mongodbcrudspring.infrastructure.repository.EnderecoRepository;
import com.unipe.mongodbcrudspring.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notNull;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;


    public EnderecoEntity salvaEndereco(EnderecoEntity enderecoEntity) {
        return enderecoRepository.save(enderecoEntity);
    }

    public EnderecoEntity findByUsuarioId(String usuarioId) {
        return enderecoRepository.findByUsuarioId(usuarioId);
    }

    public void deleteByUsuarioId(String usuarioId) {
        enderecoRepository.deleteByUsuarioId(usuarioId);
    }

}
