package com.objetos;

public class Director extends Empleado{
    
    @Override
    public int getDiasVacaciones(){
        int vacas = super.getDiasVacaciones();
        System.out.println("Vacaciones director");
        return vacas+8;
    }
    // Implementa
    public int getDiasVacaciones (int diasExtra) {
        return 30 +diasExtra;
    }
    
    public void mandar(){
        System.out.println("Obedece");
    }

    public Director () {
        // Debemos indicar el salario minimo
        int salminimo = super.getSalarioMinimo();
        this.setSalarioMinimo(salminimo+200);
    }
}
