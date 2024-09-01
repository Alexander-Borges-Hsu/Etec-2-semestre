package com.javalokura.herancapt2.models;


public class Cachorro extends Animal{
    
    public Cachorro(String Especie, String Nome) {
        super(Especie, Nome);
    }
    
    public void Latir(){
        System.out.println(getNome() + " esta latindo");
    }
}
