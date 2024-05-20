package Programacion.Test;

// importaciones
import Programacion.Enumeracion.Dias;
import Programacion.Enumeracion.Continentes;

public class TestEnumeracion {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES); // Basicamente se trata como una clase
        indicarDiaSemana(Dias.DOMINGO);
        indicarDiaSemana(Dias.MARTES);

        System.out.println("Continente: " + Continentes.AMERICA);
        System.out.println("Numero de paises: " + Continentes.AMERICA.getPaises()); // Basicamente se trata como si el elemento tuviera su propio metodo
    }






    // Metodo para imprimir dias segun la clase de dia que se le pase
    private static void indicarDiaSemana (Dias dias){
        switch (dias){
            case LUNES:
                System.out.println("Dia 1");
                break;
            case MARTES:
                System.out.println("Dia 2");
                break;
            case MIERCOLES:
                System.out.println("Dia 3");
                break;
            case JUEVES:
                System.out.println("Dia 4");
                break;
            case VIERNES:
                System.out.println("Dia 5");
                break;
            case SABADO:
                System.out.println("Dia 6");
                break;
            default:
                System.out.println("Dia 7");
                break
            ;

                
        }
    }
}
