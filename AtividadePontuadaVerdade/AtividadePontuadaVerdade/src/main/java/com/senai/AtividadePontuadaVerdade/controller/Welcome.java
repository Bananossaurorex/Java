package com.senai.AtividadePontuadaVerdade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {

    @GetMapping("/Boas-Vindas")
    private String oi(){
        return "Seja bem vindo";
    }
}
