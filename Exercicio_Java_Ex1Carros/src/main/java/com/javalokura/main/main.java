package com.javalokura.main;


public class main {
    public static void main (String[] args){
        Carro HB20 = new Carro("Hyundai", "HB20 Hatch", 2012, "Gasolina e alcool");
         HB20.acelerar();
         HB20.frear();
        
         System.out.println();
         
        CarroEletrico Seal = new CarroEletrico("BYD", "Seal", 2024, "Eletrico", "82,56 kWh");
        Seal.acelerar();
        Seal.carregarBateria();
        Seal.frear();
        
    }
}
