package com.senai.Pontuada.service;

import com.senai.Pontuada.exception.EmailJaCadastradoException;
import com.senai.Pontuada.model.Cliente;
import com.senai.Pontuada.repository.ClienteRepository;
import com.senai.Pontuada.model.Cliente;
import com.senai.Pontuada.repository.ClienteRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.aspectj.bridge.IMessage;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    public Cliente salvar(@Valid Cliente cliente){
        if(clienteRepository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(@Valid Cliente cliente){
        Cliente clienteAtualizar = clienteRepository.findById(cliente.getId()).orElseThrow(() -> new RuntimeException(("Cliente não encontrado")));

        clienteAtualizar.setNome(cliente.getNome());
        clienteAtualizar.setEmail(cliente.getEmail());
        clienteAtualizar.setSexo(cliente.getSexo());
        clienteAtualizar.setSalario(cliente.getSalario());
        clienteAtualizar.setEndereco(cliente.getEndereco());

        return clienteRepository.save(clienteAtualizar);
    }

    public void excluir(Long id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado."));
        clienteRepository.deleteById(id);
    }
}