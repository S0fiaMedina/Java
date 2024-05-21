package Programacion.Test;

import Programacion.ConversionObjetos.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado; // Definicion de la variable

        empleado = new Escritor("juan",5000, TipoEscritura.CLASICO); // inicializacion en clase hija
        // la conversion de DATOS ENTRE UNA superclase y su subclase es implicita
        System.out.println("empleado: " + empleado);

    }
}
