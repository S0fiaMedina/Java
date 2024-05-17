package Laboratorios.FundamentosEnJava.mundopc;

public class Monitor {
    // atributos estaticos
    private static int contadorMonitores;

    // atributos dinamicos 
    private int idMonitor;
    private String marca;
    private double tamanio;

    // Llamada al constructor vacio
    public Monitor(){
        this.idMonitor = contadorMonitores++;
    }

    // Constructor con argumentos
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    // toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor: { ").append("id: ");
        sb.append(this.idMonitor).append(", marca: ");
        sb.append(this.marca).append(", Tamaño: ");
        sb.append(this.tamanio).append(" }");
        return sb.toString();
    }

    //getters y setters

    // id
    public int getId(){
        return this.idMonitor;
    }
    
    // marca 
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    // tamaño
    public double getTamanio(){
        return this.tamanio;
    }
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }

}
