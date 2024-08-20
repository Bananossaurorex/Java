/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author aluno.den
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Fisica fisica = new Fisica(Sexo.FEMININO, EstadoCivil.CASADO, "10/10/1920", "Luzandra", "40028922", "gmail.com", 
                new Endereco("Rua", "18", "17 andar", "4892", "Salvador", UnidadeFederativa.BAHIA)) {
                };
        System.out.println(fisica.toString());
    }
}
