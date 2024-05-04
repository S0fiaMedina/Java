package sobrecargaMetodos;

public class Operaciones {

    public static int sumar(int a, int b){ //Metodo estatico - por eso no es necesario inicializar argumentos
        return a + b;
    }
    
    //Sobrecarga

    public static double sumar(double a, double b){
        return a + b;
    }
}
