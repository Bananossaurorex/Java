package com.senai.AtividadePontuadaVerdade.service;

import ch.qos.logback.core.net.server.Client;
import com.senai.AtividadePontuadaVerdade.model.Funcionario;
import com.senai.AtividadePontuadaVerdade.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class FuncionarioService {
private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }
    public Funcionario salvar(@Valid Funcionario funcionario){
        if(funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }
    public Funcionario atualizar(@Valid Funcionario funcionario){
        Funcionario funcionarioAtualizar = funcionarioRepository
                .findById(funcionario.getId())
                .orElseThrow(() -> new IllegalArgumentException(("Funcionario não encontrado")));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setEmail(funcionario.getEmail());
        funcionarioAtualizar.setSexo(funcionario.getSexo());
        funcionarioAtualizar.setSalario(funcionario.getSalario());
        funcionarioAtualizar.setEndereco(funcionario.getEndereco());

        return funcionarioRepository.save(funcionarioAtualizar);
    }

    public void excluir(Long id){
        Funcionario funcionario = funcionarioRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado."));
        funcionarioRepository.deleteById(id);
    }
}
