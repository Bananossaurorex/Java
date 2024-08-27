/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Diretor extends CargoConfianca implements Contratacao{
    private final double PREMIO = 0.5;

    public Diretor(Bonificacao bonificao, String nome, String cpf, String rg, Endereco endereco, String dataNascimento, double Salario, Setor setor, Sexo sexo) {
        super(bonificao, nome, cpf, rg, endereco, dataNascimento, Salario, setor, sexo);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Você esta admitido");
        System.out.println("Dados do funcio" + super.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Você esta demitido");
    }
    
    @Override
    public String toString() {
        return super.toString() + "Diretor{" + "PREMIO=" + PREMIO + '}';
    }

    @Override
    public double salarioFinal() {
         double salarioFinal = 0;
         salarioFinal = super.Salario +(super.Salario * Bonificacao.DIRETOR.getValor());
     return salarioFinal;
    }

    
}
