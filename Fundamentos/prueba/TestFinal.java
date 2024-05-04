package prueba;
import palabraFinal.Persona;
public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10; // Al ponerle final, se vuelve casi como una constante
        // miVariable = 11; - Error !
        System.out.println( "final miVariable = " + miVariable); // Prueba de final en variables

        System.out.println("Constante : " + Persona.CONSTANTE_DE_JAVA); // Prueba de constantes

        final Persona persona1 = new Persona(); 
        // persona1 = new Persona() - ! Error 

        persona1.setNombre("Juan");
        System.out.println(persona1.getNombre());

    }
}
