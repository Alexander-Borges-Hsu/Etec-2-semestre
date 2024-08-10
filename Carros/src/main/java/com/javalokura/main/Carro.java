package com.javalokura.main;


class Carro extends Veiculo{
    private String tipoDeCombustivel;
    
    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel){
        super(marca, modelo, ano);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    
    public void acelerar(){
        System.out.println(modelo + " movido a gasolina, alcool ou diesel, foi de 0 a 50km em 12 segundos.");
    }
}
