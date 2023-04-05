package application;



import application.entidades.Cliente;
import application.entidades.Massa;

import javax.swing.*;
import java.util.Locale;

public class Cantina {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cliente cliente = new Cliente();
        Massa massa = new Massa();

        int opcao = 5;

        String nome = JOptionPane.showInputDialog(null,"Informe o nome do cliente: " ,"Nome",JOptionPane.PLAIN_MESSAGE);
        cliente.setNome(nome);

        String massaNome = JOptionPane.showInputDialog(null,"Informe o nome da massa: " ,"Massa",JOptionPane.PLAIN_MESSAGE);
        massa.setTipo(massaNome);

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor da massa: " ,"Massa",JOptionPane.PLAIN_MESSAGE));
        massa.setValor(valor);
        System.out.println(cliente.getNome());

        do {

            switch (opcao){
                case 1:
            }


        }while (opcao != 5);
    }
}
