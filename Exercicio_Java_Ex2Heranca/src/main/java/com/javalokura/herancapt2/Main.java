package com.javalokura.herancapt2;

import java.util.Scanner;
import com.javalokura.herancapt2.models.Administrativo;
import com.javalokura.herancapt2.models.Tecnico;
import com.javalokura.herancapt2.models.Gato;
import com.javalokura.herancapt2.models.Cachorro;
import com.javalokura.herancapt2.models.Rico;
import com.javalokura.herancapt2.models.Pobre;
import com.javalokura.herancapt2.models.Miseravel;
import com.javalokura.herancapt2.models.Ingresso;
import com.javalokura.herancapt2.models.Imovel;
public class Main {
    public int recebe;
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Administrativo P1 = new Administrativo("Roberto Araujo ", "345.403.134-23", "32",
                "Curso Administracao", "82484651011");
        
        Tecnico P2 = new Tecnico("Magstelia de Franca ", "974.610.677-13", "19", "Curso Tecnico",
                "55378954122");
        
        System.out.print(P1.getNome());
        System.out.print(P1.getNumMatricula());
        
        System.out.println("");
        
       System.out.print(P2.getNome());
       System.out.print(P2.getNumMatricula());
       
       System.out.println("");
       System.out.println("");
       
       Gato gato = new Gato("Gato", "Gato Alfredo");
       gato.Miar();
       
       Cachorro cachorro = new Cachorro("Cachorro", "Cachorro Bidu");
       cachorro.Latir();
       
       gato.Caminhar();
       cachorro.Caminhar();
       
       System.out.println("");
       System.out.println("");
       
       Rico Alexander = new Rico("Alexander Borges Hsu", "674.874.223-12", "18", "ADS");
       Alexander.Riqueza();
       
       Pobre LucasBilanciere = new Pobre("Lucas Bilanciere", "788.983.545-15", "16", "Esnino Medio");
       LucasBilanciere.Pobreza();
       
       Miseravel Leticia = new Miseravel("Leticia Viana", "667.224.745-11", "16", "Ensino Medio");
       Leticia.Miseria();
       
       System.out.println("");
       System.out.println("");
       
       
       System.out.print("Informe o tipo de ingresso, 1 para comum e 2 para VIP: ");
       int recebe = scanner.nextInt();
       
       int recebe2 = 0;
       
       if(recebe == 1){
           System.out.println("Seu ingresso e tipo comum");
       }else if(recebe == 2){
           System.out.print("Digite 1 para camarote superior ou 2 para camarote inferior: ");
           recebe2 = scanner.nextInt();
       }else{
           System.out.println("Numero invalido, tente novamente");
       }
       
       Ingresso ingresso = new Ingresso(recebe, recebe2);
       
       if(recebe2 == 0){
           System.out.println("O valor do ingresso comum e 50R$");
       }else if(recebe2 == 2){
           System.out.println("Seu camarote e inferior, valor do ingresso e 100R$");
       }else if(recebe2 == 1){
           System.out.println("Seu camarote e superior valor do ingresso e 120R$");
       }else{
           System.out.println("Informacoes digitadas errado, tente novamente");
       }
           
       System.out.println("");
       System.out.println("");
       
       System.out.print("Informe o Imovel, 1 para novo e 2 para velho: ");
       int NumImovel = scanner.nextInt();
       
       if(NumImovel == 1){
           System.out.println("O imovel escolhido foi novo, valor- 1.000.000R$");
       }else if(NumImovel == 2){
           System.out.println("O imovel escolhido foi velho, valor- 400.000R$");
       }else{
           System.out.println("Informacoes digitadas errado tente novamente.");
       }
       
       Imovel imovel = new Imovel(NumImovel);
       
       
    }
}
