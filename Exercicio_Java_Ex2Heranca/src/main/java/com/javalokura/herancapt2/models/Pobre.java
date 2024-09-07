package com.javalokura.herancapt2.models;


public class Pobre extends Pessoa{
    
    public Pobre(String nome, String cpf, String idade, String TipoCurso) {
        super(nome, cpf, idade, TipoCurso);
    }
    
    public void Pobreza(){
        System.out.println(getNome() + " e pobre e necessita trabalhar 8+ horas por dia para "
                + "sobreviver.");
    }
}
