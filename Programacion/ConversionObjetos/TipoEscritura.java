package Programacion.ConversionObjetos;

public enum TipoEscritura { // Enum para describir los tipos de escritura
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    // Atributo de descripcion
    private final String descripcion;

    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }

    //getter
    public String getDescripcion(){
        return this.descripcion;
    }
}
