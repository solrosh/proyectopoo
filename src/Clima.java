// Un mes estará compuesto por su NOMBRE, temperatura maxima y una temperatura minima.
// Quisiera obtener también la media mensual del mes:
    // - Nombre mes: String Propiedad
    // -temperatura maxima: int Propiedad
    // - temperatura minima: int Propiedad
    // - Media mensual: double método
    // Dentro de com.objetos creamos una clase llamada Mes
    // Dentro de src creamos una clase llamada temperaturas con main() y probamos instanciando un mes y vemos si funciona.
// Añadimos version 2:
    // - Me gustaría poder tener los 12 meses.
    // - Perdir al usuario los datos y posteriormente, dibujar todos los meses.
    // - Hacemos un for y vamos añadiendo cada mes con los datos que nos ha dado el usuario.
    // Tendremos otro bucle que recorrera nuestro arraylist y mostrará cada mes.

// Añadimos versión 3:
    //-- Todo automatico,no pedir al usuario, fuera el Scanner.
    //-- Tendremos elementos fijos y elementos variables en nuestro nuevo programa.
        // * Fijos : nombre del mes
        // * Variables: max,min.


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.objetos.Mes;

public class Clima {
    public static void main(String [] srt) {
        Random random = new Random();
        String [] meses = new String[] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}; 
        for (int i=0;i<12;i++){
            Mes mes = new Mes();
            System.out.println("Introduzca los datos del mes");
            System.out.print("Nombre del mes: ");
            String nombre = meses[i];
            System.out.print("Temperatura maxima: ");
            Integer tempMax = random.nextInt(40);
            System.out.print("Temperatura minima: ");
            Integer tempMin = random.nextInt();
            mes.setNombreMes(nombre);
            mes.setMaxima(tempMax);
            mes.setMinima(tempMin);
        }

        for (Mes m: meses) {
            System.out.println(m);
        }
    }
}
