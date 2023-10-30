import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double valor_diaria = 200.0, taxa, valor_final;
        int dias;

        // entrada
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias de hospedagem: "));

        // processamento e saída
        if (dias < 10){
            valor_final = valor_diaria + 20;
            JOptionPane.showMessageDialog(null, "O valor final da diária será de R$" + valor_final + " reais");
        } else if ( dias == 10) {
            valor_final = valor_diaria + 15;
            JOptionPane.showMessageDialog(null, "O valor final da diária será de R$" + valor_final + " reais");
        } else{
            valor_final = valor_diaria + 10;
            JOptionPane.showMessageDialog(null, "O valor final da diária será de R$" + valor_final + " reais");
        }

    }
}