package prueba;

import Encapsulamiento.Persona;
// import [paquete].[clase]
// con import * se cargan todas las clases de un archivo

public class PersonaPrueba {
    public static void main(String args[]){
        Persona persona1 = new Persona("Juan", 5000, false);
        System.out.println("Persona 1: " + persona1.getNombre());
        //Prueba de getters y setters
        persona1.setNombre("Juan Carlos"); 
        //usar persona1.nombre nos arrojará un error ya que el atributo está establecido como privado
        System.out.println("Nombre de persona 1: " + persona1.getNombre());
        System.out.println("Sueldo persona 1: "+ persona1.getSueldo());
        System.out.println("Estado persona 1: "+ persona1.isEliminado());

        System.out.println("Persona 1:" + persona1);
    
    }   
}
