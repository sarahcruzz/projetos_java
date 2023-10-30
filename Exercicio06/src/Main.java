import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double valor, quantidade;

        // entrada
        quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de picolés desejada: "));

        // processamento
        if (quantidade > 10){
            valor = quantidade * 1.50;
        }else {
            valor = quantidade * 2.00;
        }

        // saída
        JOptionPane.showMessageDialog(null, "Quantidade de picolés: " + quantidade +
                "\nValor a ser pago: R$" + valor);

    }
}