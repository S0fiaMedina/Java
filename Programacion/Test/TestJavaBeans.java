package Programacion.Test;
import Programacion.JavaBeans.Person;

public class TestJavaBeans {

    public static void main(String[] args) {
        Person persona = new Person();
        persona.setNombre("Juan");
        persona.setApellido("Perez");

        System.out.println("Person - " +  persona);
        

    }
}