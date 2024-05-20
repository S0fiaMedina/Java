package Programacion.Enumeracion;

public enum Continentes {
    // elementos de la enumeracion
    AFRICA(50), // entonces cuando se crea una enumeracion, debe asociarse con su constructor
    EUROPA(46),
    ASIA(44),
    OCEANIA(14),
    AMERICA(34);


    // atributo
    private final int paises;

    // Constructor 
    /*
    - El constructor esta asociado a cada uno de los elementos
    - Si se agregan mas atributos, estos deben estar inicializados
    */
    Continentes(int paises){
        this.paises = paises;
    }

    //getter de paises
    public int getPaises(){
        return this.paises;
    }
}
