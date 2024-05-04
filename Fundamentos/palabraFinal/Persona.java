package palabraFinal;

public /*final*/ class Persona { //Si tuviera final, no puede tener clases hijas
    public final static int  CONSTANTE_DE_JAVA = 10;

    private String nombre; // Atributo de la clase

    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }

    //getters y setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
