package Programacion.Test;

import Programacion.Genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> claseGenerica = new ClaseGenerica(15);
        claseGenerica.obtenerTipo();
        // El tipo T es Integer

        ClaseGenerica<String> claseGenerica2 = new ClaseGenerica("Juan");
        claseGenerica2.obtenerTipo();
        // El tipo T es String

    }
}
