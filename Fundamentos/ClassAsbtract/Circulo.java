package ClassAsbtract;

public class Circulo  implements Figurilla, Dibujable, Rotable{ //implementacion de interfaces

    private double radio; // es mala paractica asignar valores aca

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    public void dibujar(){

    }
    public void rotar(){
        
    }
}
