package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public enum UnidadeFederativa {
    BAHIA("Bahia"),
    SAO_PAULO9("Sao_paulo"),
    RIO_DE_JANEIRO("RIO_DE_JANEIRO");
    
    private String texto3;

    private UnidadeFederativa(String texto3) {
        this.texto3 = texto3;
    }

    public String getTexto3() {
        return texto3;
    }
    
}
