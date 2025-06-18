package com.objetos;

public class CocheDeportivo extends Coche{

    public CocheDeportivo(){
        this.setVelocidadMax(320);
    }

    public int turbo (){
        int velocidadActual = this.getVelocidad();
        this.setVelocidad(velocidadActual+40);
        if (this.getVelocidad()>this.getVelocidadMax()) {
            this.setVelocidad(this.getVelocidadMax());
        }
        System.out.println(this.getVelocidad());
        return this.getVelocidad();
    }
    @Override
    public void acelerar(){
        int velocidadActual = this.getVelocidad();
        this.setVelocidad(velocidadActual+50);


        if (getVelocidad() == 0 || velocidadActual == 0) {
            System.out.println("el coche debe arrancar primero");
        }
        else if (this.getVelocidad() > this.getVelocidadMax()) {
            this.setVelocidad(this.getVelocidadMax());
        }
        else {
        System.out.println(this.getVelocidad());
        }
    }
}
