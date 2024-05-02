package prueba;
import contextoEstatico.Persona;

public class contextoEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println(persona1); // id 1

        Persona persona2 = new Persona("Carla");
        System.out.println(persona2); // id 2

        /*
         * Si la variable de contador persona no fuera estatica, ambos objetos tendrían el id de 1
         * ya que el atributo estaría mas asociado con el objeto que con la clase,
         * ya que al estar asociada a la clase, todos los objetos comparten el valor, si la variable se incrementa
         * ese cambio se va a transmitir en el atributo de los siguientes objetos
        */

    }

}
