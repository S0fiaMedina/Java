// Esto Hace parte del ejercicio de herencia 
package Herencia;

public class Employee extends Person {
    // atributos de empleado
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; // Variable estatica para contar los ids

    // Constructores
    public Employee(String nombre, double sueldo){
        super(nombre); //LLamar al constructor de Person que se inicializa solo con el nombre
        this.idEmpleado = Employee.contadorEmpleado++; //Aumenta el id
        this.sueldo = sueldo;
    }

    //getters y setters
    public int getIdEmpleado(){
        return this.idEmpleado;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    //Metodo toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado = {\n");
        sb.append(super.toString());
        sb.append("idEmpleado : ").append(this.idEmpleado);
        sb.append("\nSueldo: ").append(this.sueldo);
        return sb.toString();
    }

    
}