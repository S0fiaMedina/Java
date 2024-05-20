package Programacion.Test;

import Programacion.Sobreescritura.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println(gerente1.obtenerDetalles());


        

        // variable de la clase padre
        Empleado empleado = new Empleado("Karla", 5000);
        imprimir(empleado);


        // variable de la clase hija
        Gerente gerente  = new Gerente("Carlos", 10000, "Contabilidad");
        imprimir(gerente);

    }

    /** ---- POLIMORFISMO ----- */
    public static void imprimir(Empleado empleado){ // Para que acepte tanto gerente como empleado, se usa el tipo más geenrico, es decir, la clase padre
        System.out.println("Empleado : " + empleado.obtenerDetalles());
    }
    // El polimorfismo se pone en practica aqui, ya que el metodo actuara distinto según la clase que se llame, y como cada clase tiene especificado el metodo de obtenerDetalles()
}
