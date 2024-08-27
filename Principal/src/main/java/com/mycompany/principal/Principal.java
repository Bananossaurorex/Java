/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

import javax.crypto.AEADBadTagException;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
       Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Brenin", "123456789", "1222", 
               new Endereco("Rua da chuva", "38", "17 andar", "1222", "Salvador", UnidadeFederativa.BAHIA), 
               "10/10/2010", 6000, Setor.ENGENHARIA, Sexo.MASCULINO);
        System.out.println(diretor.toString());
    }
}
