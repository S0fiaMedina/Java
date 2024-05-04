package Herencia;

public class Empleado extends Persona {
   private int idEmpleado;
   private double sueldo;
   private static int contadorEmpleado;

   //Constructor vacio (sobrecarga de constructores   )
   public Empleado(){
      // super() --> Llamada implicita al constructor padre
      this.idEmpleado = Empleado.contadorEmpleado++;
   }

   //Constructor
   public Empleado(String nombre, double sueldo){
      // super(nombre); // Se selecciona el constructor con un solo argumento - Aqui se inicializa el nombre de Persona
      this(); // Llamada al constructor vacio
      this.nombre = nombre;
      this.sueldo = sueldo;
      this.idEmpleado = Empleado.contadorEmpleado++;
   }

   //gettter y setters
   public int getIdEmpleado(){ // no es necesario un setter de idEmpleado :p
      return this.idEmpleado;
   }

   public double getSueldo(){
      return this.sueldo;
   }

   public void setSueldo( double sueldo){
      this.sueldo = sueldo;
   }

   @Override
   public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append ("Empleado {idEmpleado = ").append(idEmpleado);
      sb.append(", ").append(super.toString()).append('}'); //Atributo de la clase padre
      sb.append(", sueldo").append(this.sueldo);
      sb.append('}');
      return sb.toString(); //toca llamar el metodo toString para que se retorne
      // un string en vez de un objeto StringBuilder 
   }
}
