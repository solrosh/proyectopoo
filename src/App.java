import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Probando la clase Persona");
        // Cuando hablamos de Clases, necesitamos objetos para trabajar con dichas clases
        Persona person = new Persona();
        person.nombre = "lucas";
        person.apellidos = "ayala";
        person.edad = 29;

        System.out.println(person.nombre+person.apellidos+person.edad);
    }
}
