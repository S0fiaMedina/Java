package Programacion.Test;

import Programacion.ConversionObjetos.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado; // Definicion de la variable

        empleado = new Escritor("juan",5000, TipoEscritura.CLASICO); // inicializacion en clase hija
        // la conversion de DATOS ENTRE UNA superclase y su subclase es implicita
        System.out.println("empleado: " + empleado);

        // Esta linea si nos enviará errores ya que el metodo getTipoEscritura no estaba definido en la clase de empleado
        // empleado.getTipoEscritura();


        /*DOWNCASTING*/
        Escritor escritor = (Escritor)empleado;
        escritor.obtenerDetalles();

        /*UPCASTING*/
        Empleado empleado2 = escritor; //cuando escritor pasa a empleado, se hace de manera implicita
        System.out.println(empleado2.obtenerDetalles());
    }
}
