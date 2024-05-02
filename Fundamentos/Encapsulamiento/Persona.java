package Encapsulamiento;

/*  Ejemplo de Encapsulamiento*/
public class Persona{
// Establecimiento de variables
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //Constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    /*------  METODOS PARA NOMBRE  ---------*/
    //getter
    public String getNombre(){
        return this.nombre;
    }
    //setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

        /*------  METODOS PARA SUELDO  ---------*/
    //getter
    public double getSueldo(){
        return this.sueldo;
    }
    //setter
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

        /*------  METODOS PARA ELIMINADO  ---------*/
    //getter
    public boolean isEliminado(){
        return this.eliminado;
    }
    //setter
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }


    //  TO STRING 
    // Imprime el estado de el objeto
    public String toString(){
        return "Persona [ nombre : "+ this.nombre  +
                " , sueldo :" + this.sueldo + 
                " , eliminado : " + this.eliminado + " ]";
    }
}