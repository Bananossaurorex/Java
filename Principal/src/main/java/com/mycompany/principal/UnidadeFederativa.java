/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public enum UnidadeFederativa {
    BAHIA("Bahia"),
    SAO_PAULO("São Paulo"),
    RIO_JANEIRO("Rio De Janeiro");
    
    private String sigla;

    private UnidadeFederativa(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
    
}
