package Programacion.Interfaces;

// en esta otra implmentacion, se trabajaria con una hipotetica base de datos de Oracle
public class ImplementacionOracle implements AccesoDatos {
    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
        
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");

        
    }

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");

        
    }

    @Override
    public void listar() {
        System.out.println("Insertar desde Oracle");
        
    }
}
