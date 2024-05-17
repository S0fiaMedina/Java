package Laboratorios.FundamentosEnJava.mundopc;

public class Teclado extends DispositivoDeEntrada{

    // atributos
    private static int contadorTeclados;
    private int idTeclado;

    public Teclado(String nombre, String marca){
        super(nombre, marca);
        this.idTeclado = Teclado.contadorTeclados++;
    }

    //get 
    public int getIdTeclado(){
        return this.idTeclado;
    }

    // toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("id del teclado: ").append(this.idTeclado);
        return sb.toString();
    }
}
