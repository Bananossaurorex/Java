package com.senai.Pontuada.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "tab_name")
public class Cliente {


    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Email(message = "Email deve ser valido")
    @NotBlank(message = "Email é obrigatorio")
    private String email;

    @Enumerated(EnumType.ORDINAL)
    private Sexo sexo;

    private Double salario;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, Sexo sexo, Double salario, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.salario = salario;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public @Email(message = "email deve ser valido") @NotBlank(message = "Email é obrigatorio") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "email deve ser valido") @NotBlank(message = "Email é obrigatorio") String email) {
        this.email = email;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}