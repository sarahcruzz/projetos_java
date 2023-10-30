import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double num1 = 0, num2 = 0, resultado = 0;
        int operacao = 0, yorno;

        // pergunta ao usuário
        yorno = JOptionPane.showConfirmDialog(null, "Deseja realizar uma operação?", "CALCULADORA", JOptionPane.YES_NO_OPTION);

        // laço de repetição

        if (yorno == JOptionPane.YES_OPTION) {

            // escolha do tipo de operação
            operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a operação desejada usando o seguinte:" +
                    "\n1 - adição \n2 - subtração \n3 - multiplicação \n4 - divisão" +
                    "\n\nInsira o valor correspondente abaixo: "));

            // validação da operação
            while (operacao < 1 || operacao > 4) {
                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!", "Opção inválida", JOptionPane.WARNING_MESSAGE);
                operacao = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor entre 1 a 4: "));
            }

            // entrada dos números da operação
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número da operação: "));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número da operação: "));

            // processamento
            switch (operacao) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> resultado = num1 / num2;
            }

            //saída
            JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } else if (yorno == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "       FIM DO PROGRAMA", "Operação cancelada", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
