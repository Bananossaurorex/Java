/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Motorista extends Funcionario{
    private String carteiraTrabalho;

    public Motorista(String carteiraTrabalho, String nome, String cpf, String rg, Endereco endereco, String dataNascimento, double Salario, Setor setor, Sexo sexo) {
        super(nome, cpf, rg, endereco, dataNascimento, Salario, setor, sexo);
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

   
    @Override
    public String toString() {
        return "--Motorista--\n" + "CarteiraTrabalho:" + carteiraTrabalho + super.toString();
    }

    @Override
    public double salarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
