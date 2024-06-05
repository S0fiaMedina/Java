package Programacion.ClaseAbstracta;

public  abstract class FiguraGeometrica {
    protected String tipoFigura; // Atributo

    // Constructor de la clase
    protected FiguraGeometrica (String tipoFigura){
        this.tipoFigura = tipoFigura;
    }

    //Este es un metodo abstracto, no sabemos como se va a implementar en cada clase hija pero pues  existe xd 
    public abstract  void dibujar();

    //Metodos basicos

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
    }
    



}
