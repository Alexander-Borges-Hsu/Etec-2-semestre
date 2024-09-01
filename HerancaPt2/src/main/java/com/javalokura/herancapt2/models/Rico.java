package com.javalokura.herancapt2.models;


public class Rico extends Pessoa{
    
    public Rico(String nome, String cpf, String idade, String TipoCurso){
        super(nome, cpf, idade, TipoCurso);
    }
    
    public void Riqueza(){
        System.out.println(getNome() + " e rico e vive de dividendos.");
    }
    
}
