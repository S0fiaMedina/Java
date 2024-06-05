package Programacion.ClaseAbstracta;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura); // inicializa el atributo del padre
    }

    // implementacion del metodo abstracto
    @Override //se sobreescribe parcialmente, ya que se implementa por primera vez
    public void dibujar(){
        System.out.println("Se imprime un" + this.getClass().getSimpleName());
    }
}
