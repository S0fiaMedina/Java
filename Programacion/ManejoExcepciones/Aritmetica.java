package Programacion.ManejoExcepciones;

public class Aritmetica {
    // el throws indica que puede arrojar un error
    public static int division(int numerador , int denominador) throws OperacionExcepcion { 
        if (denominador == 0){
            // arroja el error
            throw new OperacionExcepcion("Division entre 0"); // ahora, desde el test de excepciones se apunta a esta linea de codigo
        } else {
            return numerador / denominador;
        }
    }
}
