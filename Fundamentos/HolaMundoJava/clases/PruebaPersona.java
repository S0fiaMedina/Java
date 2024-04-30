package HolaMundoJava.clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; // Se define variable con el objeto como tipo de dato (instancia de la clase)
        persona1 = new Persona(); // Java es capaz de acceder a clases de el mismo paquete 
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformación();

        /*------------------- o  --- */
        Persona persona2 = new Persona();
        System.out.println("persona 1= " + persona1); // HolaMundoJava.clases.Persona@251a69d7
        System.out.println("persona 2 = " + persona2); // Nos va a dar la direccion de memooria de persona2

        persona2.desplegarInformación(); // imprime null
        persona2.nombre = "Karla";
        persona2.apellido = "Martinez";
        
    }
}
