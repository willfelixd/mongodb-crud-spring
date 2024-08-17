package com.unipe.mongodbcrudspring.api;

import com.unipe.mongodbcrudspring.api.request.UsuarioRequestDTO;
import com.unipe.mongodbcrudspring.api.response.UsuarioResponseDTO;
import com.unipe.mongodbcrudspring.business.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user", produces = {"application/json"})
@RequiredArgsConstructor
@Tag(name = "mongodbcrudspring", description = "Controlador para Salvar, Buscar e Apagar dados do usuário")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping()
    @Operation(summary = "Salva os dados do Usuário:", description = "(Método para salvar dados do Usúario)",
            method = "POST")
    @ApiResponse(responseCode = "200", description = "Usúario salvo com sucesso!")
    @ApiResponse(responseCode = "400", description = "Usúario já cadastrado!")
    @ApiResponse(responseCode = "500", description = "Erro no servidor!")
    public ResponseEntity<UsuarioResponseDTO> gravaDadosUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        return ResponseEntity.ok(usuarioService.gravarUsuarios(usuarioRequestDTO));
    }


    @GetMapping()
    @Operation(summary = "Busca Usúario por Email:", description = "(Método para buscar o Usúario por Email)",
            method = "GET")
    @ApiResponse(responseCode = "200", description = "Usúario encontrado com sucesso!")
    @ApiResponse(responseCode = "400", description = "Email não cadastrado!")
    @ApiResponse(responseCode = "500", description = "Erro no servidor!")
    public ResponseEntity<UsuarioResponseDTO> buscaUsuarioPorEmail(@RequestParam ("email") String email) {
        return ResponseEntity.ok(usuarioService.buscaDadosUsuario(email));
    }

    @DeleteMapping
    @Operation(summary = "Apaga os dados pelo Email do Usuário:", description = "(Método para apagar os dados com o Email do Usúario)",
            method = "DELETE")
    @ApiResponse(responseCode = "202", description = "Email do Usúario apagado com sucesso!")
    @ApiResponse(responseCode = "400", description = "Email não cadastrado!")
    @ApiResponse(responseCode = "500", description = "Erro no servidor!")
    public ResponseEntity<Void> deletaDadosUsuario(@RequestParam ("email") String email) {
        usuarioService.deletaDadosUsuario(email);
        return ResponseEntity.accepted().build();
    }

}
