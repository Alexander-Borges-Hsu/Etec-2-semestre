package com.javalokura.herancapt2.models;


public class Pessoa {
    private String nome;
    private String cpf;
    private String idade;
    private String TipoCurso;
    
    public Pessoa(String nome, String cpf, String idade, String TipoCurso){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.TipoCurso = TipoCurso;
    }

    public String getNome() {
        return nome;
    }
    
    
}
