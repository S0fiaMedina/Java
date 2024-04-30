package ClassAsbtract;

public abstract class Figura {
    protected double x; //Atributo protegido que solo pueden heredar los hijos
    protected double y; //posicion en y

    protected Figura(double x, double y){ //Constructor
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();// Metodo abstracto 
    /*
     * Solo se declara el metodo, no se define, para que cada clase lo implemente a su forma
    */


}
