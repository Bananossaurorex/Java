/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected String dataNascimento;
    protected double Salario;
    protected Setor setor;
    protected Sexo sexo;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, String dataNascimento, double Salario, Setor setor, Sexo sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.Salario = Salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    
   
    @Override
    public String toString() {
    return "Funcionario\nnome=" + nome + ", cpf=" + cpf + ", rg=" + rg + "\nEndereco" + endereco.toString() +
                " dataNascimento=" + dataNascimento + ", Salario=" + salarioFinal()+ ", setor=" + setor.getNome() + ", sexo=" + sexo.getTexto() + '}';
    }
    
}
