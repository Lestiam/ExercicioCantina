package application.entidades;

public class Ingredientes {
    private String nome;//ex: bacon, mussarela, tomate, etc
    private double valor;

    public Ingredientes(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
