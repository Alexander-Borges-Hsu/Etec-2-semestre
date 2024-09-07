package com.javalokura.herancapt2.models;



public class Miseravel extends Pessoa{
    
    public Miseravel(String nome, String cpf, String idade, String TipoCurso) {
        super(nome, cpf, idade, TipoCurso);
    }
    
    public void Miseria(){
        System.out.println(getNome() + " e miseravel, nao consegue se alimentar bem, vive "
                + "situacoes precarias e recebe bolsa familia.");
    }
}
