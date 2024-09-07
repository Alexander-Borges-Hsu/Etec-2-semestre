package com.javalokura.herancapt2.models;


public class Gato extends Animal{
    
    
    public Gato(String Especie, String Nome) {
        super(Especie, Nome);
    }
    
    public void Miar(){
        System.out.println(getNome() + " Esta miando");
    }
}
