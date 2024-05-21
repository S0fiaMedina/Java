package Programacion.Test;

import Programacion.InstanceOf.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        
        Empleado gerente = new Gerente("Karla", 5000, "Contabilidad");
        determinarTipo(gerente);


    
    }

    
    public static void determinarTipo(Empleado empleado){ 
       if (empleado instanceof Gerente){ // La variable es de tipo gerente ?
        System.out.println(empleado + "Es de tipo gerente");
        Gerente gerente = (Gerente)empleado; // se onvierte la variable al tipo de la clase hija
        gerente.getDepartamento();


       } else if (empleado instanceof Empleado){ // La variable es de tipo Empleado (Padre)
        System.out.println(empleado + "Es de tipo Empleado");

       } else if(empleado instanceof Object){ // La variable es de tipo object?
        System.out.println(empleado + "Es de tipo object");

       }
    }
    
}

