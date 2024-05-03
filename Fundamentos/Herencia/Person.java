/*
 * Este es un ejercicio de herencia
 */

package Herencia;

public class Person {
    // declaración de atributos
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Constructores
    public Person(){ //construcor vacio
    }

    public Person(String nombre){ //Constructor que inicializa nombre
        this.nombre = nombre;
    }

    public Person(String nombre, char genero, int edad, String direccion){ //Constructor que inicializa todos los atributos
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    // getters y setters

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public char getGenero(){
        return this.genero;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }

    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    //Metodo toString
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Persona = { \n");
        sb.append("\nNombre : ").append(this.nombre);
        sb.append("\nGenero : ").append(this.genero);
        sb.append("\nEdad : ").append(this.edad);
        sb.append("\nDireccion : ").append(this.direccion);
        return sb.toString();
    }
}
