package Programacion.Test;

public class TestAutoBoxingUnboxing {

    public static void main(String[] args) {
        
        /*----- AUTOBOXING ----*/

        Integer entero = 10; // objeto de tipo entero

        System.out.println("Entero de tipo string: " + entero.toString()); // Lo transformará en una cadena
        System.out.println("Entero de tipo double: " + entero.doubleValue());

        /* ---- UNBOXING ---- */

        int entero2 = 10; // dato primitivo
        System.out.println(entero2);




    }
}

