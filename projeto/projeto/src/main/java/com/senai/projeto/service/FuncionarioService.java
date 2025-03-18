package com.senai.projeto.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.senai.projeto.repository.FuncionarioRepository;
import com.senai.projeto.model.Funcionario;


@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }
    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
    public Funcionario buscarPorEmail(String email) {
        return funcionarioRepository.findByEmail(email);
    }
    public Funcionario deleteFuncionario(Long id) {
        Funcionario funcionario = funcionarioRepository.findById(id).orElse(null);
        funcionarioRepository.deleteById(id);
        return funcionario;
    }
    public Funcionario updateFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
