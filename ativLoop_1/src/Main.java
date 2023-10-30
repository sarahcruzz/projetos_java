import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int count = 1, calculo = 1, num;

        // entrada
        num = Integer.parseInt(JOptionPane.showInputDialog("Fatorial do número: "));

        // processamento com laço de repetição
        while (num < 0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro que seja positivo: "));
        }

        while(count <= num){
            calculo = calculo * count;
            count ++;
        }

        // saída
        JOptionPane.showMessageDialog(null, String.format("O fatorial do número %d é %d", num, calculo), "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}