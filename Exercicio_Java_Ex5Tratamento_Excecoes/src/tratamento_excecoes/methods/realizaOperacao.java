package tratamento_excecoes.methods;

import tratamento_excecoes.models.ExceptionMessage.validaOperacao;


public class realizaOperacao {
    
    public static void realizarOperacao(int valor, String operacao, int valor2) throws validaOperacao{
        switch(operacao.toLowerCase()){
            case "add":
                System.out.println("Resultado: " + (valor + valor2));
                break;
            case "sub":
                System.out.println("Resultado: " + (valor - valor2));
                break;
            case "mult":
                System.out.println("Resultado: " + (valor * valor2));
                break;
            case "div":
                System.out.println("Resultado: " + (valor / valor2));
                break;
            default:
                throw new validaOperacao("Operacao nao permitida: " + operacao);
        }
        
    }
}
