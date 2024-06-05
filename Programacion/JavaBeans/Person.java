package Programacion.JavaBeans;
import java.io.Serializable; // Se importa la clase serializable

public class Person  implements Serializable{ // Se implementa la clase

    // -- requisito: atributos privados
    private String nombre;
    private String apellido;

    // -- requisito: constructor vacio
    public Person(){
        
    }
    // constructor adicional
    public Person(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }


     // -- requisito: getters y setters para cada atributo de la clase
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   

    // adicional: to String

    @Override
    public String toString() {
        return "Person [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

   
    

    
}
