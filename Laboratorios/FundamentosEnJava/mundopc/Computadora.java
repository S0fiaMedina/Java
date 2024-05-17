package Laboratorios.FundamentosEnJava.mundopc;

public class Computadora {
    // atributos estaticos
    private static int contadorComputadoras;


    // atributos dinamicos
    private String nombre;
    private int idComputadora;

    // objetos creados de los componentes de la computadora
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    // constructor vacio
    public Computadora(){
        this.idComputadora = Computadora.contadorComputadoras++;
    }

    // constructor con argumentos
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    // toString 
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Información del pc: {");
        sb.append(" id: ").append(this.idComputadora);
        sb.append(", Nombre: ").append(this.nombre);
        sb.append(", Partes de la computadora: ").append(this.monitor.toString());
        sb.append(this.teclado.toString()).append(this.raton.toString());
        return sb.toString();
    }

    // getters y setters 
    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
}
