package prueba;

import Herencia.Employee;
import Herencia.Client;

public class testHerencia {
    public static void main(String[] args) {
        Employee empleado1 = new Employee("Juan", 5000.0);
        System.out.println("empleado 1 = " + empleado1);

        Client cliente1 = new Client("Karla", 'F', 34, "Carrera 58, 5544", true);
        System.out.println("cliente1: " + cliente1);
    }
}
