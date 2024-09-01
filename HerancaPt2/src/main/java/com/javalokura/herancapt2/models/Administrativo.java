package com.javalokura.herancapt2.models;


public class Administrativo extends Pessoa{
    private String NumMatricula;
    
    public Administrativo(String nome, String cpf, String idade, String TipoCurso, String NumMatricula) {
        super(nome, cpf, idade, TipoCurso);
        this.NumMatricula = NumMatricula;
    }

    public String getNumMatricula() {
        return NumMatricula;
    }
    
    
}
