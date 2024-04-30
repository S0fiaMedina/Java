package Aritmetica.Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(); //constructor vacio -  objeto (variable qiue apunta al objeto)
        System.out.println("aritmeica1.a es "+ aritmetica1.a);
        System.out.println("aritmetica1.b es " + aritmetica1.b);
        /*-->  Como es un constructor vacio inicia con valores nulos a = 0; b = 0*/

        Aritmetica aritmetica2 = new Aritmetica(5, 8); // consttructor sobrecargado
        System.out.println("aritmeica2.a es "+ aritmetica2.a);
        System.out.println("aritmetica2.b es " + aritmetica2.b);

        //Variables locales
        

    }
}
