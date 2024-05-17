package Laboratorios.FundamentosEnJava.mundopc;

public class DispositivoDeEntrada {

    /*--- ATRIBUTOS ---*/
    protected String tipoEntrada;
    protected String marca;

    // Constructor para inicializar los atributos
    public DispositivoDeEntrada (String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }


    // metodo to string
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Dispositivo de Entrada = { ");
        sb.append("Tipo: ").append(this.tipoEntrada);
        sb.append(", marca: ").append(this.marca);
        sb.append(" }");
        return sb.toString();
    }

    // getters y setters

    public String getTipoEntrada(){
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

}

