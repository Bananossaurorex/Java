package com.senai.Pontuada.repository;

import com.senai.Pontuada.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Override
    Optional<Cliente> findById(Long Long);
    Optional<Cliente> findByEmail(String email);
}
