package prueba;
import arrays.Persona;

public class testMatrices {
    public static void main(String[] args) {
        int edades[][] = new int [3][3]; // El primer corchete -> filas - segundo corchete -> Columnas
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

        // Impresion de los elementos de una matriz
        for (int ren = 0; ren < edades.length; ren++){
            for(int col = 0; col < edades[ren].length; col++){ // Hasta el lenght del array de filas
                System.out.println("Edades: "+ ren + " - " + col + " "+ edades[ren][col]);
            }
        }

       String frutas[][] = {{"naranja", "limon"}, {"Fresa", "Zarzamora"}};

       // Ciclo for para la impresion
       for (int i = 0; i < frutas.length; i++){
        for(int j = 0; j < frutas[i].length; j++){
            System.out.println("futas: " + j  + frutas[i][j]);
        } 
       }
       // MAtrices de objetos
       Persona personas[][] = new Persona[2][3];
       personas[0][0] = new Persona("Juan");
       personas[0][1]  = new Persona("Karla");

       imprimir(personas);
    }

    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("MAtriz:"+ i +" - "+ j +  " "+ matriz[i][j]);
            } 
       }
    }
}
