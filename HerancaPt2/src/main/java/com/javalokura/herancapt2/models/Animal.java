package com.javalokura.herancapt2.models;


public class Animal {
    String Especie;
    private String Nome;
    
    public Animal(String Especie, String Nome){
        this.Especie = Especie;
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }
    
    public void Caminhar(){
        System.out.println(getNome() + " esta caminhando");
    }
    
}
