package models;


public class Aluno extends Pessoa{
    private String IdNumMatricula;
    
    public Aluno(String nome, String idade, String IdNumMatricula) {
        super(nome, idade);
        this.IdNumMatricula = IdNumMatricula;
    }

    public String getIdNumMatricula() {
        return IdNumMatricula;
    }

    
    @Override
    public void atividade() {
        System.out.println("O(a) aluno(a) "+  getNome() +" frequenta aulas e pratica instrumento.");
    }

    @Override
    public void getId() {
        System.out.println("O identificaodor do(a) aluno(a) "+ getNome() +" eh a matricula "
                + getIdNumMatricula()+".");
    }
    
    
}
