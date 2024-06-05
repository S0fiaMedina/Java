package Programacion.Test;
import  static Programacion.ManejoExcepciones.Aritmetica.division; // se importa el metodo

import Programacion.ManejoExcepciones.OperacionExcepcion;

public class ManejoExcepciones1 {
    public static void main(String[] args) {
        int resultado = 0;

        try{ // Bloque con posibles errores
            resultado = division(10, 0);
        
        } catch (OperacionExcepcion  e ){ 
            System.out.println("Ocurrió un tipo de error de OperacionExcepcion: " + e.getMessage());

        } catch (Exception e){
            //e.printStackTrace(System.out); // imprime la pila de excepciones
            System.out.println("Ocurrio un error: " + e.getMessage());

        } finally{ // Siempre se ejecuta este bloque sin importar si hay un error o NO
            System.out.println("Se revisó la division por 0");
        }
        System.out.println(resultado); // se imprime cuando se acaba el try catch


    }
}
