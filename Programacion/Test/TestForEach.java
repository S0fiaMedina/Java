package Programacion.Test;

import Programacion.ForEach.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,9,10};

        // Uso del for each


        for (int edad : edades) { /// Edad : variable que almacena cada elemento. Edades : el array a recorrer
            System.out.println("Edad = " + edad);
        }

        /*--- creacion con sintaxis resumida -----*/
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};

        for (Persona persona : personas){
            System.out.println(persona);
        }


    }
}
