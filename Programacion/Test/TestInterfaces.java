package Programacion.Test;

import Programacion.Interfaces.*;
public class TestInterfaces {
    public static void main(String[] args) {
        //define variable de interfaz de mysql
        AccesoDatos datos = new implementacionMySQL();
        datos.listar();
        // polimorfismo
        datos = new ImplementacionOracle();
        datos.listar();

    }

    public static void imprimir(AccesoDatos datos){
        datos.listar();
    }
}
