
package Laboratorios.FundamentosEnJava;

/*
 * NOTA: Es importante importar todos ya que, pot ejemplo, computadora depende de monitor, teclado y raton 
*/
import Laboratorios.FundamentosEnJava.mundopc.*; 


public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP );
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer );
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}