package ClassAsbtract;

public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado(double lado, double x, double y){
        super(x,y); //superconstructor, para heredar los atributos de la clase padre (algo como componentes web)
        this.lado = lado;

    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
