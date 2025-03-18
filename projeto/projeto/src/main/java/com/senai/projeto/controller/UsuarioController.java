package com.senai.projeto.controller;
import com.senai.projeto.model.Usuario;
import com.senai.projeto.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @PostMapping("/salvar")
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok(usuario);

    }
    @GetMapping("/buscar")
    public ResponseEntity<Usuario> buscarPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.buscarPorEmail(email));
    }
    @DeleteMapping("/deletar")
    public ResponseEntity<Usuario> deletarUsuario(@RequestParam Long id) {
        return ResponseEntity.ok(usuarioService.deleteUser(id));
    }
    @PutMapping("/atualizar")
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.updateUser(usuario));
    }
}

