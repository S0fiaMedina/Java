package prueba;
import sobrecargaMetodos.Operaciones;

public class SobrecargaTest {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3); //Llamada al metodo con los argumentos de tipo entero
        System.out.println(resultado);

        var resultado2 = Operaciones.sumar(5.6, 8.9); // Llam   ada al metodo con los argumentos tipo double
        System.out.println(resultado2);
    }
}
