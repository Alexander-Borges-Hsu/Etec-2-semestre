package com.javalokura.arraylist_ex;

import java.util.ArrayList;

public class BuscarElemento {
    
    public static void Buscar(String objeto, ArrayList lista){
        boolean encontrado = lista.contains(objeto);
        
        if(encontrado){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
        
    }
    
    public static void BuscarPares(ArrayList<Integer> lista){
        
        ArrayList <Integer> pares = new ArrayList<Integer>(); 
        
        for(int i = 0; i < lista.size(); i++){
            
            if(lista.get(i) % 2 == 0){
                pares.add(lista.get(i));
            }
        }
        
        System.out.println(pares);
        
    }
    
}
