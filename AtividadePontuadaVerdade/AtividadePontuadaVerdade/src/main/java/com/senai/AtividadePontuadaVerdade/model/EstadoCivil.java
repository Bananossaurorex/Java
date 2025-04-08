package com.senai.AtividadePontuadaVerdade.model;

public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");

    private String estado;

    EstadoCivil(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }
}
