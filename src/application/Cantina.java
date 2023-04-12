package application;

import application.entidades.Cliente;
import application.entidades.Ingredientes;
import application.entidades.Massa;
import application.entidades.Pedido;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;

public class Cantina {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);

            Cliente cliente = new Cliente();
            Massa massa = new Massa();

            String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente: ", "Nome"
                    , JOptionPane.PLAIN_MESSAGE);
            if (nome.matches(".*\\d.*")) {
                throw new Exception("Inválido! Contém números, digite apenas letras");
            }

            cliente.setNome(nome);

            String massaNome = JOptionPane.showInputDialog(null, "Informe o nome da massa: ", "Massa"
                    , JOptionPane.PLAIN_MESSAGE);
            if (massaNome.matches(".*\\d.*")) {
                throw new Exception("Inválido! Contém números, digite apenas letras");
            }
            massa.setTipo(massaNome);


            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da massa: "
                    , "Massa", JOptionPane.PLAIN_MESSAGE));
            massa.setValor(valor);


            ArrayList<Ingredientes> ingredientes = new ArrayList<>();
            int opcao = 0;

            while (opcao != 5) {
                String opcaoStr = JOptionPane.showInputDialog(null,
                        "Informe os ingredientes escolhidos: \n1 - Bacon\n2 - Mussarela\n3 - Tomate\n4 - Queijo\n5 - Sair"
                        , "Ingredientes: ", JOptionPane.PLAIN_MESSAGE);
                opcao = Integer.parseInt(opcaoStr);

                switch (opcao) {
                    case 1:
                        ingredientes.add(new Ingredientes("Bacon", 2.0));
                        break;
                    case 2:
                        ingredientes.add(new Ingredientes("Mussarela", 2.0));
                        break;
                    case 3:
                        ingredientes.add(new Ingredientes("Tomate", 2.0));
                        break;
                    case 4:
                        ingredientes.add(new Ingredientes("Queijo", 2.0));
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Número inválido", "Valor do pedido:"
                                , JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }

            Pedido pedido = new Pedido(cliente, massa, ingredientes);

            String mensagem = "Pedido feito para " + pedido.getCliente().getNome() + "!\n" +
                    pedido.getMassa().getTipo() + " com ";

            if (pedido.getIngredientes().size() > 0) {
                for (int i = 0; i < pedido.getIngredientes().size(); i++) {
                    mensagem += pedido.getIngredientes().get(i).getNome();
                    if (i < pedido.getIngredientes().size() - 2) {
                        mensagem += ", ";

                    } else
                        mensagem += " e ";
                }
            } else
                mensagem += "nenhum acréscimo e";

            mensagem += " \no valor ficou em:  R$" + String.format("%.2f", pedido.calculaPedido()) + " reais";
            JOptionPane.showMessageDialog(null, mensagem, "Valor do pedido:", JOptionPane.PLAIN_MESSAGE);
        }catch (NumberFormatException ex1) {
            JOptionPane.showMessageDialog(null,"Digite apenas números!", "Excessão",JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Excessão", JOptionPane.ERROR_MESSAGE);
        }
    }
}
