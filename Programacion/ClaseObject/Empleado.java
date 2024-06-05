package Programacion.ClaseObject;

public class Empleado {

    // Atributos
    protected String nombre;
    protected double sueldo;

    // constructor
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //MEtodo que se va a sobreescribir

    public String obtenerDetalles(){
        return "Nombre" + this.nombre + ", " + "Sueldo: " + this.sueldo; // basicamente es uja cadena con todos los atributos
    }

    //Metodo HASH
    

    // getters y setters

    public String getNomnbre(){
        return this.nombre;
    }
    // HASHCODE
    // Basicamente se busca generar un numero unico posible a partir de los atributos
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sueldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; //Compara la ref en memoria de este objeto con el obj a comparar

        if (obj == null)
            return false; // si el otro objeto es nulo, pues no son iguales

        if (getClass() != obj.getClass())
            return false; // Valida si ambos objetos son de la misma clase

        Empleado other = (Empleado) obj; // Si ambos obj son de la clase Empleado...
        if (nombre == null) {
            if (other.nombre != null)
                return false; // compara los nombres y retorna falso si uno de ellos es nulo

        } else if (!nombre.equals(other.nombre))
            return false; // Si loa nombres no son iguales (compara cadenas)

        if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
            return false; // Si los sueldos no son iguales

        return true; //  Si las comparaciones anteriories no funcionaron, enronnces son iguales los objetos
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
}