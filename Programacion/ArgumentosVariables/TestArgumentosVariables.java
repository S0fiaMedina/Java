package Programacion.ArgumentosVariables;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2,3);
        variosParametros("Juan", 8,9,10);
        
    }
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre" + nombre);
        imprimirNumeros(numeros);

    }
    // metodo con argumentos variables (Como un arreglo que se ingresa a l metodo) - numeros es el nombre del argumento variable
    private static void imprimirNumeros(int...numeros){ // recordar que el estatico se usa para evitar tener que crear una clase como tal
        // (no se puede llamar un no estatico desde un metodo estatico como lo es main)
        
        for (int  i = 0; i < numeros.length; i++){ // se usa length ya que se trata igual que un arreglo
            System.out.println("Elemento: " + numeros[i]);
        }
    }
}
