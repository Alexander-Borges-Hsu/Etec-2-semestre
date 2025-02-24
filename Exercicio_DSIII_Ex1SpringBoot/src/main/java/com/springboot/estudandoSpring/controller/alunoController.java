package com.springboot.estudandoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/aluno")
public class alunoController {

    @RequestMapping("/get")
    public String getNomeByParam(@RequestParam String nome) {
        return "Nome coletado: " + nome;
    };

    @GetMapping("/get/{nome}")
    public String getNomeByPath(@PathVariable(value = "nome") String nome) {
        return "Nome coletado: " + nome;
    };
}
