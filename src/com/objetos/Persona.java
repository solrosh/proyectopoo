package com.objetos;

import java.util.Scanner;

public class Persona {
    public String nombre;
    public String apellidos;
    public int edad;
    private int dni;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) throws Exception  {
        // Debemos controlar la edad y realizar la acción que más nos guste.
        // 1) Error silencioso: 
        // El programador no sabe que ha hecho algo mal, simplemente lo soluciono yo aquí.
        if (edad <0){
            throw new Exception("La edad no puede ser negativa");
        }
        else {
            this.edad = edad;
        }
    }
    public void dividirNumeros (int num1,int num2) throws Exception {
        
        // try {
        //     int division = num1 / num2;
        //     String dato = "abcde";
        //     int valor = Integer.parseInt(dato);

        // } catch (ArithmeticException e) {
        //     System.out.println("Hay un problema");
        // }
        if (num2 == 0) {
            throw new Exception("No me gusta ese cero");
        }
        int dividirNumeros = num1/num2;
    }
    // Por cada propiedad, tendremos dos metodos GET/SET
    // vamos a instalar un extensión que nos permita generar.
    

    // TIPOS DE GENERO
    public enum tipoGenero {
        FEMENINO, MASCULINO,OTROS
    }

    private tipoGenero genero;


    public tipoGenero getGenero() {
        return this.genero;
    }

    public void setGenero(tipoGenero genero) {
        this.genero = genero;
    }


    // NOMBRE COMPLETO
    public String getNombreCompleto () {
            return this.nombre + " " + this.apellidos;
    }

    // NOMBRE COMPLETO EN MAYUSCULAS
    public String getNombreCompletoMay() {
        return this.nombre.toUpperCase() + " " + this.apellidos.toUpperCase();
    }

    // PersonaDNI
    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    // LetraDni
    public char letraDni (){
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        int resultado = (dni - (dni / 23) * 23);
        char letra = letrasDni.charAt(resultado);
        // System.out.println("Su letra del DNI es " + letra);
        return letra;
    }
}
