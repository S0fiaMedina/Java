package Programacion.BloquesDeInicializacion;

public class Persona {
    private static int contadorPersonas;

    private final int idPersona;

    /*---- bloque de inicializacion estatico ----|*/
    static{
        System.out.println("Ejecucion bloque estatico");
        Persona.contadorPersonas++; // Se incrementa el contador
    }

    /*---- bloque de inicializacion no estatico ----*/

    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas;
    }

    /*---- Constructor vacio de la clase ----*/

    public Persona(){
        System.out.println("Ejecucion del constructor");
        // Para el momento en el que se ejecute este bloque, ya se habrán ejecutado los bloques de
        // inicializacion estaticos y dinamicos
    }

    /*--- getter de idPersona ---*/
    public int getIdPersona(){
        return this.idPersona;
    }


}
