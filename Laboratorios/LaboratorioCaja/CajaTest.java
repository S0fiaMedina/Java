package Laboratorios.LaboratorioCaja;

public class CajaTest { //Clase de prueba 
    public static void main(String args[]){
        Caja caja1 = new Caja(1,2,3); //Creacion de objeto
        int volumenCaja1 = caja1.calcularVolumen(1, 2, 3); //LLamado al metodo
        System.out.println(volumenCaja1); //Impresion del valor
    }
}
