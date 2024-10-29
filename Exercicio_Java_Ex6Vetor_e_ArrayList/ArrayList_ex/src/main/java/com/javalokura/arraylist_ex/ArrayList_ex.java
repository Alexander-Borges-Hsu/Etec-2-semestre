package com.javalokura.arraylist_ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayList_ex {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        ArrayList<String> frutas = new ArrayList<String>();
        
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Melancia");
        frutas.add("Bergamota");
        frutas.add("Laranja");
        
        System.out.println(frutas);
        System.out.println("");
        
        frutas.remove(3);   
        
        System.out.println("Fruta do indice 3 removida");
        System.out.println(frutas);
        System.out.println("");
        
        System.out.print("Busque uma fruta na ArrayList: ");
        String busca = scan.next();
        
        BuscarElemento Enviar = new BuscarElemento();
        Enviar.Buscar(busca, frutas);
        
        System.out.println("");
        
        ArrayList<Integer> Nums = new ArrayList<Integer>();
        
        Nums.add(9);
        Nums.add(12);
        Nums.add(57);
        Nums.add(62);
        Nums.add(11);
        Nums.add(10);
        Nums.add(753);
        Nums.add(365);
        Nums.add(85);
        Nums.add(2);
        Nums.add(99);
        Nums.add(5);
        Nums.add(76);
        Nums.add(34);
        Nums.add(54);
        
        Collections.sort(Nums);
        System.out.println("Lista ordenada:");
        System.out.println(Nums);
        
        System.out.println("Numeros pares da Lista ordenada: ");
        
        Enviar.BuscarPares(Nums);
        
    }
}
