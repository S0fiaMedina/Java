package Programacion.InstanceOf;

public class Gerente extends Empleado {
    
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo); // Llamada al constructor con argumentos de la clase padre
        this.departamento = departamento;
    }

    @Override // Le inidica al compilador que estamos sobreescribiendo 
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " + this.departamento; // se accede al comportamiento del metodo en la clase padre
    }


    // getters y setters

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
}
