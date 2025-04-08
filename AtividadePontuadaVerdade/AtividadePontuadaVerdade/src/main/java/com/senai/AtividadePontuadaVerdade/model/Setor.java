package com.senai.AtividadePontuadaVerdade.model;

public enum Setor {
    ENGENHARIA("Setor"),
    JURIDICO("Juridico"),
    SAUDE("Saude");

    private String setores;

    Setor(String setores) {
        this.setores = setores;
    }

    public String getSetores() {
        return setores;
    }
}
