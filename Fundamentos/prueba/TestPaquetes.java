package prueba;

// import paquetes.co.com.ejemplo.Utileria; - se importa solo la clase
// import paquetes.co.com.ejemplo.* - Se importan todas las clases
// import static paquetes.co.com.ejemplo.Utileria.imprimir; // se importa solo el metodo estatico

public class TestPaquetes {
    public static void main(String[] args) {
        // Utileria.imprimir("Saludos"); // Mejor practica
        //imprimir("Saludos :D");
        paquetes.co.com.ejemplo.Utileria.imprimir("Saludoss :D"); // Este es el nombre comppletamente calificado (No es buena practica)
    }
}
