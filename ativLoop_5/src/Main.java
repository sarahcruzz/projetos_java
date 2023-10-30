import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int num, i, calculo;
        StringBuilder total = new StringBuilder();

        // entrada do usuário
        num = Integer.parseInt(JOptionPane.showInputDialog("Tabuada do número: "));

        // processamento
        for (i = 1; i <= 10; i++){
            calculo = num * i;
            total.append(num).append(" * ").append(i).append(" = ").append(calculo).append("\n");
        }

        // saída
        JOptionPane.showMessageDialog(null, total.toString(), "Tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
}