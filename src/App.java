import java.util.ArrayList;
import java.util.Arrays;

import com.objetos.Director;
import com.objetos.Empleado;
import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            Empleado emp = new Empleado();
            Director director = new Director();
            System.out.println(emp.getSalarioMinimo());
            System.out.println(director.getSalarioMinimo());
            emp.setNombre("Empleado");
            emp.setApellidos("Empleado");
            emp.setSueldo(88888888);
            System.out.println(emp.getNombreCompleto());
           

            // creamos un objeto
            Persona tryion = new Persona("Turion","Lamnister");
            System.out.println(tryion.getNombreCompleto());
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
        person.dniConLetra("12345678Y");
        

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

        Empleado emp2 = new Empleado();
        emp2.setApellidos("ayala");
        emp2.setNombre("juan");
       System.out.println(emp2.toString());

       ArrayList <Empleado> empleados = new ArrayList<Empleado>();
       Empleado emp1 = new Empleado();
       emp1.setNombre("empleado 1 ");
       emp1.setApellidos("empleado 1");
       empleados.add(emp1);
       
       
       emp2.setNombre("empleado 2 ");
       emp2.setApellidos("empleado 2");
       empleados.add(emp2);
    }
}
