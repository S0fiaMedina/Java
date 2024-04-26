package Aritmetica.Operaciones;

public class Aritmetica {
    // Atributos
    int a; //como es un tipo primitivo, su valor x default es 0
    int b;

    //Metodos
    public void sumar(){
        int resultado = a +  b;
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
}
