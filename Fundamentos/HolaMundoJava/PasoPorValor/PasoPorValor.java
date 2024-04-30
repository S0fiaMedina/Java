package HolaMundoJava.PasoPorValor;

public class PasoPorValor {

    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = "+ x);

        cambioValor(x); //Se pasa una copia de la variable local
    }

    public static void cambioValor(int arg1){
        System.out.println("arg1 = ");
    }
    
}
