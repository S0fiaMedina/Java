package Herencia;

public class Persona{
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    //Constructor vacio
    public Persona(){

    }
    //Constructor para solo iniializar el nombre
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //Constructor para inicializar todos los atributos
    public Persona(String nombre,char genero, int edad, String direccion  ){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }


    //metodos de nombre

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Metodos de genero

    public char getGenero(){
        return this.genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    // Metodos para edad

    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    //metodos paraireccion

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    //Metodo to string
    public String toString(){
        return "Persona :  { "+ 
        "Nombre : "+ this.nombre + 
        ", edad : " + this.edad + 
        ", genero: " + this.genero + 
        ", direccion: " + this.direccion + " }";
    }
}




