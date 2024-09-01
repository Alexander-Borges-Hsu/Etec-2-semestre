package com.javalokura.herancapt2.models;


public class Tecnico extends Pessoa{
    private String NumMatricula;
    
    public Tecnico(String nome, String cpf, String idade, String TipoCurso, String NumMatricula) {
        super(nome, cpf, idade, TipoCurso);
        this.NumMatricula = NumMatricula;
    }

    public String getNumMatricula() {
        return NumMatricula;
    }
    
    
    
}
