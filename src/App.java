import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        try {
             System.out.println("Probando la clase Persona");
        // Cuando hablamos de Clases, necesitamos objetos para trabajar con dichas clases
        Persona person = new Persona();
        // person.nombre = "lucas";
        // person.apellidos = "ayala";
        // person.edad = -29;
        person.setNombre("Jon");
        person.setApellidos("Nieve");
        person.setEdad(12);
        
        person.setGenero(Persona.tipoGenero.MASCULINO);
        System.out.println("género: "+ person.getGenero());
        System.out.println(person.getNombreCompleto());
        System.out.println(person.getNombreCompletoMay());
        person.dividirNumeros(10, 1);
        System.out.println(person.nombre+person.apellidos+person.edad);
        System.out.println(person.getNombre()+" "+person.getApellidos()+"Edad: "+ person.getEdad());
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

       
    }
}
