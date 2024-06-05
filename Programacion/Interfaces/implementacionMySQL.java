package Programacion.Interfaces;

public class implementacionMySQL implements AccesoDatos {

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
        
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");

        
    }

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");

        
    }

    @Override
    public void listar() {
        System.out.println("Insertar desde MySQL");
        
    }
    
}
