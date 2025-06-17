// Tendremos un salario mínimo para Empleado (1200)
// tendremos un salario minimo para un Director (1400)

// UN director cobrará 200 más que un empleado
// Tendremos en la clase Empleado una nueva propiedad llamada salarioMinimo
// Dicha propiedad la igualaremos a 1200
// Creamos una clase llamada Director y su salario minimo será de 1400.

package com.objetos;

public class Empleado extends Persona {
    private int salarioMinimo;
    private int diasVacaciones;


    // Quiero nombre apellidos y salario minimo, metodo que no se piede sobrescribir.

    

    @Override
    public String toString(){
        return this.getNombreCompleto()+" "+this.salarioMinimo;
    }

    public final void metodoFinal () {
        System.out.println("Soy un método final");;
    }

    public int getDiasVacaciones() {
        return this.diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    

    public int getSalarioMinimo() {
        return this.salarioMinimo;
    }

    protected void setSalarioMinimo(int salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }


    public Empleado () {
        super("aa","a");
        System.out.println("Empleado");
        this.salarioMinimo = 1900;
    }
    public Empleado (String nombre, String apellidos)
    {
        super(nombre,apellidos);
        System.out.println("Constructor nombre y apellidos Empleado");
    }
    //Implementar algo en el empleado
    private int sueldo;

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
