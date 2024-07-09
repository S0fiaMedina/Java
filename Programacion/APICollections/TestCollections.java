package Programacion.APICollections;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList(); // uso de listas (notacion de diamante)
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        Set<String> miSet = new HashSet();

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        //imprimir(miLista);
        //imprimir(miSet);

        // mapas
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Sofia");
        miMapa.put("valor2", "Marcela");
        miMapa.put("valor3", "Daniela"); // agregando parees de clave - valor

        String elemento = (String) miMapa.get("valor1"); // como es downCasting, se convierte a String
        

        // usando imprimir para miMapa (se transforma el conjunto de sus llaves a un set)
        //imprimir(miMapa.keySet());
        imprimir(miMapa.values());


    }

    public static void imprimir(Collection<String> collection){ // recibe el tipo mas generico: la interfaz padre
        collection.forEach(
            element -> {// para cada elemento que pertenezca a la interfaz collectiosn
                System.out.println("Elemento : " + element);
            });

    }
}
