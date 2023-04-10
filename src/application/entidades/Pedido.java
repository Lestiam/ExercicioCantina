package application.entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Massa massa;
    private Cliente cliente;
    private List<Ingredientes> ingredientes;

    public Pedido(Cliente cliente, Massa massa, ArrayList<Ingredientes> ingredientes) {
        this.cliente = cliente;
        this.massa = massa;
        this.ingredientes = ingredientes;
    }

    public double calculaPedido(){

        return massa.getValor() + (ingredientes.size() * 2);
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }


}
