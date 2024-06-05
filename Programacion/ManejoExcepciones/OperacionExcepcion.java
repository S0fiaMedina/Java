package Programacion.ManejoExcepciones;

public class OperacionExcepcion extends Exception{


    // constructor
    public OperacionExcepcion (String mensaje){
        super(mensaje); // se propaga el mensaje a la clase 
    }
}
