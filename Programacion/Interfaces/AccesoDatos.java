package Programacion.Interfaces;

// crud 
public interface AccesoDatos {
    int MAX_REGISTRO = 10; // todos los atributos de una interfaz son constantes

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
