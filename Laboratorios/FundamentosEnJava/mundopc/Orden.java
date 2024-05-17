package Laboratorios.FundamentosEnJava.mundopc;

public class Orden {
    // atributos estaticos
    public static final int  MAX_COMPUTADORAS = 10; 
    private static  int contadorOrdenes;

    // atributos dinamicos
    private int ordenId;
    private Computadora computadoras[];
    private int numComputadoras = 0;

    // aumenta el id y se inicializa el array
    public Orden(){
        this.ordenId = Orden.contadorOrdenes++;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    // metodo para agregar pc, se verifica el numero y se agrega
    public void agregarComputadora(Computadora computadora){
        if (this.numComputadoras < MAX_COMPUTADORAS){
            this.computadoras[numComputadoras] = computadora; // se asigna la computadora a la posición actual
            this.numComputadoras++;
        } else{
            System.out.println("Lo siento, se ha sobrepasado el limite de computadoras " +  MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println("Información de la orden ");
        for (int i = 0; i < this.numComputadoras; i++){
            System.out.println("------ PC" + i + "--------");
            System.out.println(this.computadoras[i].toString());
            System.out.println( "----- id de la orden: " + this.ordenId);
        }
    }

}
