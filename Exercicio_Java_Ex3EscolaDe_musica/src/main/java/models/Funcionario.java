package models;


public class Funcionario extends Pessoa{
    
    private String IdNumCracha;
        
    public Funcionario(String nome, String idade, String IdNumCracha) {
        super(nome, idade);
        this.IdNumCracha = IdNumCracha;
    }

    public String getIdNumCracha() {
        return IdNumCracha;
    }
    
    @Override
    public void atividade() {
        System.out.println("O(a) funcionario(a) "+ getNome() + " ira realizar tarefas administrativas.");
    }

    @Override
    public void getId() {
       System.out.println("O identificador do(a) funcionario(a) " +getNome()+
              " eh o numero de cracha "+ getIdNumCracha()+ "." );
    }
    
    
    
    

    
    
}
