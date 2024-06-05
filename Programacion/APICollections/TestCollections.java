package Programacion.APICollections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List miLista = new ArrayList(); // uso de listas
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        for (Object elemento : miLista){
            System.out.println(" Elemento: " + elemento );
        }





    }
}
