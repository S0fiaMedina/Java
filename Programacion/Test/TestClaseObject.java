package Programacion.Test;

import Programacion.ClaseObject.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000); 
        Empleado empleado2 = new Empleado("juan", 5000);

        // Evaluar referencia en memoria
        if (empleado == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        } else{
            System.out.println("Tiene distinta referencia en memoria");
        }

         // Evaluar contenido por metodo equals
         if (empleado.equals(empleado2)){
            System.out.println("Tienen el mismo contenidp");
        } else{
            System.out.println("Tiene distinto contenido");
        }

        if (empleado.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("Hashcode distinto");
        }
        
      
    }
    
}
