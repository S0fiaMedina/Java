package contextoEstatico;

public class Persona {
    private int idPersona;
    private String nombre;

    private static int contadorPersonas;// atributo estatico - cuenta la cantidad de instancias de este obj

    public Persona(String nombre){
        this.nombre = nombre;
        // Incrementar el contador
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    /* -------------- ATRIBUTOS DINAMICOS----------*/
    // getter de idPersona
    public int getIdPersona(){
        return this.idPersona;
    }

    //setter de persona
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }

    //getter de nombre
    public String getNombre(){
        return this.nombre;
    }

    //setter de nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /*----------- METODOS ESTATICOS -----------*/
    //gettter de contador personas
    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    //setter de contador personas
    public static void setContadorPersonas(int contadorPersonasA){
        contadorPersonas = contadorPersonasA;
    }

    
    //metodo to string de la clase
    @Override // Indica que se sobre-escribe el metodo toString()
    public String toString(){
        return "Persona: [nombre: "+ this.nombre + ", id: " + this.idPersona + "]";
    }
}
