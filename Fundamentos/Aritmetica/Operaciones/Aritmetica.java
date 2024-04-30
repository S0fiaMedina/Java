package Aritmetica.Operaciones;

public class Aritmetica {
    // Atributos
    int a; //como es un tipo primitivo, su valor x default es 0
    int b;

    //construuctor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    // Sobrecarga de constructores
    public Aritmetica(int a, int b){
        this.a = a; //El atributo de la clase = el parametro del metodo
        this.b = b;
        System.out.println("Ejecutando con argumentos");


    }

    //Metodos
    public void sumar(){
        int resultado = this.a +  this.b;
        System.out.println("Resultado :" + resultado);
    }//Modificador de acceso

    public int sumarConRetorno(){ //Metodo con retorno
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //el a de esta y sSOLO esta clase
        this.b = arg2;
        return sumarConRetorno();  //return a + b;
    }

    //Variables locales

}
