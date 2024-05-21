package Programacion.InstanceOf;

public class Empleado {

    // Atributos
    protected String nombre;
    protected double sueldo;

    // constructor
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //MEtodo que se va a sobreescribir

    public String obtenerDetalles(){
        return "Nombre" + this.nombre + ", " + "Sueldo: " + this.sueldo; // basicamente es uja cadena con todos los atributos
    }

    // getters y setters

    public String getNomnbre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
}