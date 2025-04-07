package com.senai.Pontuada.controller;


import com.senai.Pontuada.model.Cliente;
import com.senai.Pontuada.repository.ClienteRepository;
import com.senai.Pontuada.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/funcionarios")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/dev")
    private String dev(){
        return "Breno Vidal Ferreira🐧😎";
    }
    @GetMapping("/listar")
    public List<Cliente> listarTodos(){
        return clienteService.listarTodos();
    }
    @PostMapping("/salvar")
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return ResponseEntity
        .status(HttpStatus.CREATED).body(Map.of("mensagem","Cliente cadastrado com sucesso"));
    }
    @PutMapping
    public ResponseEntity<String> atualizar(@Valid @RequestBody Cliente cliente){
        clienteService.atualizar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario atualizado");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id){
        clienteService.excluir(id);
        return ResponseEntity.ok().body("Funcionario deletado com sucesso");
    }
}
