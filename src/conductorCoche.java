// Coche:

// Marca: Propiedad String
// Modelo: Propiedad String
// Velocidad: Propiedad int
// Velocidad Máxima: Propiedad int
// Arrancar(): Método
// Frenar(): Método
// Acelerar(): Método

// No podremos acelerar si el coche está parado.
// Acelerar será de 20 en 20 y no podremos superar la velocidad máxima.
// El conductor no puede modificar la velocidad máxima de un vehículo
// Frenar tendrá una sobrecarga, si frenamos normal, frenamos el coche de 10 en 10 (velocidad)
// Podremos pasar un argumento (boolean) que detendrá el coche.
// Sobrescribimos el método toString() para poder mostrar la marca, modelo y velocidad actual del Coche


// Deportivo:
// Tendrá lo mismo que un Coche y además un método llamado turbo() que incrementará la velocidad en 40.
// Acelerará de 50 en 50 y no podremos superar la velocidad máxima.

import com.objetos.Coche;
import com.objetos.CocheDeportivo;

public class conductorCoche {
    public static void main (String[] srt) {
        CocheDeportivo car1 = new CocheDeportivo();
        car1.setMarca("Rayo");
        car1.setModelo("McQueen");
        
        car1.arrancar();
        System.out.println(car1);
        car1.acelerar();
        car1.acelerar();
        car1.frenar();
        car1.turbo();
        car1.frenar();
        car1.frenar(true);
        car1.acelerar();
        // car1.frenar();
    }
}
