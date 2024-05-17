package DiseñoDeClases.com.gm.ventas;


public class Orden {
    // atributos estaticos
    private static  int contadorOrdenes;
    public static final int MAX_PRODUCTOS = 10;
    
    // atributos dinamicos
    private int numProductos;
    public  Producto productos[];
    private int idOrden;

    // constructor
    public Orden(){
        contadorOrdenes++;
        idOrden = contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS]; // iniclialización del array 
    }
    // agregar producto
    // agrega una nueva variable de tipo producto a la lista mientras verifica que no se supere el limite de productos
    public  void agregarProducto(Producto producto){
        if (this.numProductos < MAX_PRODUCTOS){
            this.productos[this.numProductos] = producto;
            this.numProductos++;
        } else {
            System.out.println("No se pueden agregar más productos.");
        }
    }
    // calcular el total
    public double calcularTotal(){
        double sumatoria = 0;
        for (int i = 0; i < productos.length; i++){
            sumatoria += productos[i].getPrecio();
        }
        return sumatoria;
    }
    
    // Mostrar la orden
    public void mostrarOrden(){
        System.out.println("Orden: {\nNumero de orden: " + idOrden + "\nproductos = [");
        System.out.println("\tNombre\tPrecio");

        for (int i = 0; i < this.numProductos; i++){
            System.out.println(productos[i]);
        }
        System.out.println("\t]\n}");
    }

    // getters y setters 

    public int getIdOrden(){
        return this.idOrden;
    }
}
