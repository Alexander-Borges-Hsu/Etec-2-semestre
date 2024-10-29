package com.javalokura.vetor_ex;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        int nums[] = new int[10];
        int soma = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.print("Digite o numero do indice " + i + ": ");
            nums[i] = scan.nextInt();
            soma += nums[i];

        }
        
        int valorMaior = nums[0];
        int valorMenor = nums[0];
           
        for(int i = 0; i < 10; i++){
            if(valorMaior <= nums[i]){
            valorMaior = nums[i];
        }                     
            if(valorMenor >= nums[i]){
               valorMenor = nums[i];
            }
        }

        System.out.println("A soma dos valores digitados e: " + soma);
        System.out.println("O menor valor e: " + valorMenor);
        System.out.println("O maior valor e: " + valorMaior);
        
    }
}
