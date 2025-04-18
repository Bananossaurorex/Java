package com.senai.AtividadePontuadaVerdade.repository;

import com.senai.AtividadePontuadaVerdade.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
