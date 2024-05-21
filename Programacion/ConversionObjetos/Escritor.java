package Programacion.ConversionObjetos;

public class Escritor  extends Empleado{
    
    final TipoEscritura tipoEscritura; // VAriable que apunta al enum


    // COnstructor
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo); // llama al constructor de empleado
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipo de escritura" + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString(){
        return super.toString() + "Tipo escritura" + this.tipoEscritura;
    }
    
}