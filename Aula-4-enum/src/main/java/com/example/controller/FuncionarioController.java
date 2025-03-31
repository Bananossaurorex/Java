package com.example.controller;

import com.example.model.Funcionario;
import com.example.repository.FuncionarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    private String oi(){
        return "Seja bem-vindo";
    }

    @GetMapping("/listar")
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }
    @PostMapping("/salvar")
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body((funcionario));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
    funcionarioRepository.deleteById(id);
    return ResponseEntity.noContent().build();
    }
}
