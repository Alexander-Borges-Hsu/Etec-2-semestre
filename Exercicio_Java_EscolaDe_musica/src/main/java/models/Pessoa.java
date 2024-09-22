package models;


public abstract class Pessoa {
    private String nome;
    private String idade;
    
    public Pessoa(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public abstract void atividade();
    public abstract void getId();
    
    
    public String getNome(){
        return nome;
    }
    
    
}
