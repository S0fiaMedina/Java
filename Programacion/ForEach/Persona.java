package Programacion.ForEach;

public class Persona {

    private String nombre;


    // constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //toString 
    @Override
    public String toString(){
        return "Persona: { " + this.nombre + '}';
    }


    // getters y setters

    public String  getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}