package DiseñoDeClases.com.gm.ventas.ventasTest;

import DiseñoDeClases.com.gm.ventas.Orden;
import DiseñoDeClases.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {

        
            Producto producto1 = new Producto("Camisa", 50.00);
            Producto producto2 = new Producto("Pantalon", 100.00);
            
            Orden orden1 = new Orden();
            orden1.agregarProducto(producto1);
            orden1.agregarProducto(producto2);
            orden1.mostrarOrden();
        
        

    }
}
