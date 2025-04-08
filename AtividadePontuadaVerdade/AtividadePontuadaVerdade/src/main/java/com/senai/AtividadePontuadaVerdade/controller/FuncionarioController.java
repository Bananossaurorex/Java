package com.senai.AtividadePontuadaVerdade.controller;


import com.senai.AtividadePontuadaVerdade.model.Funcionario;
import com.senai.AtividadePontuadaVerdade.service.FuncionarioService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("/dev")
    private String dev(){
    return "Breno Vidal Ferreira🐧😎";
    }
    @GetMapping("/listar")
    private List<Funcionario> listarTodos(){
        return funcionarioService.listarTodos();
    }
    @PostMapping("/salvar")
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.salvar(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED).body(Map.of("mensagem","Cliente cadastrado com sucesso"));
    }
    @PutMapping
    public ResponseEntity<String> atualizar(@Valid @RequestBody Funcionario funcionario){
        funcionarioService.atualizar(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Funcionário atualizado");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id){
        funcionarioService.excluir(id);
        return ResponseEntity.ok().body("Funcionário deletado com sucesso");
    }
}
