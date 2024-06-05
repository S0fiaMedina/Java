package Programacion.Test;

import Programacion.ClaseAbstracta.*;

public class TestClaseAbstracta {
    public static void main(String[] args) {
            FiguraGeometrica figura = new Rectangulo("Rectangulo"); // upCasting 
            figura.dibujar(); // polimorfismo, ya que el metodo esta presente tanto en padre como en hijo, y pues se implementa ya que figura apunta a rectangulo
            

    }
}
