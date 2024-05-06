package prueba;
import arrays.Persona;

public class testArrays {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println(" Edades : " + edades); // Imprime su direccion de memoria

        edades[0] = 10;
        edades[1] = 0;
        edades[2] = 40;
        System.out.println("Edades: [ "+ edades[0]+ ", "+ edades[1]+ ", "+ edades[2]+ " ]");

        // iterar elementos con for
        for (int i = 0; i < edades.length; i++){
            System.out.println("Edades ["+i+"] : "+ edades[i]);
        }


        /*------- ARREGLOS OBJECT -------*/
        Persona personas[] = new Persona[2];

        //Creacion de elementos de la lista (Objetos)
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        for (int j = 0; j < personas.length; j++){
            System.out.println("personas[ "+ j + "] : "+ personas[j]); //Llama al toString por defecto
        }

        /*---- ARREGLOS CON SINTAXIS RESUMIDA ---*/
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int j = 0; j < frutas.length; j++){
            System.out.println("frutas[ "+ j + "] : "+ frutas[j]);
        }



    }
}
