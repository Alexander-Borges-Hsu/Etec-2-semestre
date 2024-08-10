package com.javalokura.main;


class CarroEletrico extends Carro{
    private String capacidadeBateria;
    
    
    public CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, String capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel);
        this.capacidadeBateria = capacidadeBateria;
    }
    
    public void acelerar(){
        System.out.println(modelo + " movido 100% a energia, foi de 0 a 50km em 7 segundos.");
    }
    
    public void carregarBateria(){
        System.out.println(modelo + " esta carregando a bateria");
    }
    
}
