package com.example.model;

import jakarta.persistence.*;

@Entity
@Table (name = "tab_funcionario")
public class  Funcionario {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

@Column(nullable = false)
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @Enumerated(EnumType.STRING)
    private Setor setor;

    private Double salario;
    private String telefone;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, String rg,
                       String matricula, String dataNascimento, Sexo sexo, Setor setor, Double salario, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", matricula='" + matricula + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
