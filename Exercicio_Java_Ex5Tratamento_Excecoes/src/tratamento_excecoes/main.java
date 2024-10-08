package tratamento_excecoes;

import java.util.Scanner;
import static tratamento_excecoes.methods.realizaOperacao.realizarOperacao;
import static tratamento_excecoes.methods.validador.validador;
import tratamento_excecoes.models.ExceptionMessage.validaNum;
import tratamento_excecoes.models.ExceptionMessage.validaOperacao;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.print("Digite qualquer numero diferente de 0: ");
            int valor = scan.nextInt();
            validador(valor);
            
            System.out.print("Digite uma operacao (add/sub/mult/div): ");
            String operacao = scan.next();
            
            System.out.print("Digite um segundo valor: ");
            int valor2 = scan.nextInt();
            
            realizarOperacao(valor, operacao, valor2);
        }catch (validaNum | validaOperacao e){
            System.out.println("Erro: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Erro inesperado: " + e.getMessage());
        }finally {
            scan.close();
        }
        
        
    }
    
    
    
    
    
    
}

