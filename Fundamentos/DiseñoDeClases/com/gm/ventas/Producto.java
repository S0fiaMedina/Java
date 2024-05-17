package DiseñoDeClases.com.gm.ventas;

public class Producto {
    // Atributo estatico
    private static int contadorProductos;
    // Atributos dinamicos
    private String nombre;
    private double precio;
    private int idProducto;

    // Constructores
    private Producto(){
        contadorProductos++;
        idProducto = contadorProductos;
    }
    // Constructor con argumentos
    public Producto(String nombre, double precio){
        this();  // llamada al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }


    // getters y setters

    public int getIdProducto(){
        return this.idProducto;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    // Metodo toString
    @Override 
    public String toString(){
        return "producto: {" + "nombre: " + getNombre() + " precio: " + getPrecio() + " }"; 
    }

}
