package tratamento_excecoes.methods;

import tratamento_excecoes.models.ExceptionMessage.validaNum;


public class validador {
    
    public static void validador(int valor) throws validaNum{
        if(valor == 0){
            throw new validaNum("O valor nao pode ser nulo.");
        }
    }
}
