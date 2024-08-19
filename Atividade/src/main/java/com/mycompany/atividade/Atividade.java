/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

/**
 *
 * @author aluno.den
 */
public class Atividade {

    public static void main(String[] args) {
        Fisica fisica = new Fisica(Sexo.MASCULINO, "123.456.789", "2", "13/08/2004", 3000, "12", "Breno", "40028922", 
        new Endereco("Rua da Peira", "17", "1 andar", "2232", "Queimados", UnidadeFederativa.RIODEJANEIRO));
        
        System.out.println(fisica.toString());
    }

}


