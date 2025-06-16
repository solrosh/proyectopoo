package com.objetos;

public class Director extends Empleado{
    public Director () {
        // Debemos indicar el salario minimo
        int salminimo = super.getSalarioMinimo();
        this.setSalarioMinimo(salminimo+200);
    }
}
