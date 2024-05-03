package Herencia;
import java.time.LocalDate; // Importa el tipo de dato date
// Esto hace parte del ejercicio de herencia
public class Client extends Person{
    //Atributos:
    private int idCliente;
    private LocalDate fechaCreacion;
    private boolean vip;
    private static int counter;

    //Constructor
    public Client(String nombre, char genero, int edad, String direccion, boolean vip){
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.idCliente = Client.counter++;
        this.fechaCreacion = LocalDate.now();
    }

    // getters y setters
    public int getClientId(){
        return this.idCliente;
    }
    public LocalDate getFechaCreacion(){
        return this.fechaCreacion;
    }
    public boolean isVip(){
        return this.vip;
    }
    public void setVip(boolean vip){
        this.vip = vip;
    }

    //Metodo toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente = {\n");
        sb.append("IdCliente: ").append(this.idCliente);
        sb.append("\nVip: ").append(this.vip);
        sb.append(super.toString());
        return sb.toString();
    }
}
