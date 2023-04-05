package application.entidades;

public class Massa {
    private String tipo;//ex: Penne, espaguete, ravioli, etc
    private double valor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
