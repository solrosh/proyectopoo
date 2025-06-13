import com.objetos.Persona;
public class pruebaDni {
    public static void main(String[] srt ) {
        Persona people = new Persona();
        people.setDni(12345678);
        people.letraDni();

        System.out.println(people.getDni());
        System.out.println(people.letraDni());

    }
}
