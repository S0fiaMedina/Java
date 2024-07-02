package Programacion.Genericos;

public class ClaseGenerica<T> {

    private T objeto; // objeto generico

    public ClaseGenerica(T objeto){ // recibe cualquier objeto 
        this.objeto = objeto;
    }

    public void obtenerTipo(){
        System.out.println("El tipo T es: " + this.objeto.getClass().getSimpleName());
    }
    
}
