package com.objetos;

public class Mes {
    private String nombreMes;
    private int maxima;
    private int minima;


    public String getNombreMes() {
        return this.nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getMaxima() {
        return this.maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getMinima() {
        return this.minima;
    }

    public void setMinima(int minima) {
        this.minima = minima;
    }

    public double mediaMes() {
        double mediaMes = (this.minima+this.maxima)/2;
        return mediaMes;
    }

    @Override
    public String toString(){
        return 
            "Nombre mes: "+ nombreMes+
            " Temperatura maxima: "+ maxima+
            " Temperatura minima: "+minima+
            " Media mensual: "+mediaMes();
    }
}
