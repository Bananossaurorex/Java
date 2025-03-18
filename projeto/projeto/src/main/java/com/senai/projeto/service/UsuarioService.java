package com.senai.projeto.service;

import com.senai.projeto.model.Usuario;
import com.senai.projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
    public Usuario deleteUser(Long id) {
        Usuario user = usuarioRepository.findById(id).orElse(null);
        usuarioRepository.deleteById(id);
        return user;
    }
    public Usuario updateUser(Usuario user) {
        return usuarioRepository.save(user);
    }
}
