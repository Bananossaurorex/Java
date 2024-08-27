/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public abstract class CargoConfianca extends Funcionario {
    protected Bonificacao bonificao;

    public CargoConfianca(Bonificacao bonificao, String nome, String cpf, String rg, Endereco endereco, String dataNascimento, double Salario, Setor setor, Sexo sexo) {
        super(nome, cpf, rg, endereco, dataNascimento, Salario, setor, sexo);
        this.bonificao = bonificao;
    }

    public Bonificacao getBonificao() {
        return bonificao;
    }

    public void setBonificao(Bonificacao bonificao) {
        this.bonificao = bonificao;
    }
    
    
}
