package Laboratorios.LaboratorioCaja;

public class Caja {
    // Atributos de la clase
    int ancho;
    int alto;
    int profundo;

    // Constructor vacio 
    public Caja(){
        System.out.println("Clase caja ejecutandose :D ...");
    }

    //Constructor con argumentos
    public  Caja(int a, int b, int c){
        this.ancho = a; // Asignando atributos de la clase a este metodo, para que los valores se conserven
        this.alto = b;
        this.profundo = c;
    }

    //Metodo para calcular el volumen
    public int calcularVolumen(int a, int b, int c){
        return a*b*c;
    }
}
