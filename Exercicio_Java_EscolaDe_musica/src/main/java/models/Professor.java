package models;


public class Professor extends Pessoa{
    private String IdRegistroFuncional;
    
    public Professor(String nome, String idade, String IdRegistroFuncional) {
        super(nome, idade);
        this.IdRegistroFuncional = IdRegistroFuncional;
    }

    public String getIdRegistroFuncional() {
        return IdRegistroFuncional;
    }
    
    @Override
    public void atividade() {
        System.out.println("O(a) professor(a) "+getNome()+ " ministra aulas de musicas.");
    }

    @Override
    public void getId() {
        System.out.println("O identificador do(a) professor(a) "+ getNome()+ " eh o registro funcional "+
                getIdRegistroFuncional()+ ".");
    }

    

   
    
}
