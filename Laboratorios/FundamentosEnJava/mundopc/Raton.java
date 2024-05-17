package Laboratorios.FundamentosEnJava.mundopc;

public class Raton  extends DispositivoDeEntrada{
    // Atributos
    private static int contadorRatones;
    private int idRaton;

    // constructor
    public  Raton(String nombre, String marca){
        super(nombre, marca);
        Raton.contadorRatones++;
        this.idRaton = contadorRatones;
    }

    // get 
    public int getIdRaton(){
        return this.idRaton;
    }

    // toString 
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("id del raton: ");
        sb.append(this.idRaton);
        return sb.toString();
    }

}
