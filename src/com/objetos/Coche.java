package com.objetos;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMax;
    public String arrancar;
    public int frenar;
    public int acelerar;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMax() {
        return this.velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void arrancar(){
        // arrancar = 0 // Apagado
        // arrancar = 1 // encendido
        System.out.println("Arrancando...");
    }
    
    public void acelerar(){
        if (this.velocidad == 0){
            System.out.println("Primero arranca el coche");
        }else if ((this.velocidad+acelerar) > velocidadMax) {
            velocidad=velocidadMax;
            System.out.println("Has llegado al limite de velocidad "+velocidad);
        }else {
            acelerar = 20;
            velocidad+= acelerar;
            System.out.println(velocidad+" km/h");
        }
    }
    public void frenar () {
        if (velocidad==0 ) {
            System.out.println("Aparcao");
        }else {
        frenar = 10;
        velocidad-=frenar;
        System.out.println(velocidad+" km/h");}
    }

}
