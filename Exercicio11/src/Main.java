import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double imc, peso, altura;

        // entradas
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em Kgs: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros: "));

        // processamento e saída
        imc = peso / (altura * altura);

        if (imc < 18.5){
            JOptionPane.showMessageDialog(null, String.format("Seu imc é de  %.2f", imc) +
                    "\nClassificação: 'NORMAL'");
        } else if (imc >= 18.5 && imc < 25) {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é de  %.2f", imc) +
                    "\nClassificação: 'NORMAL'");
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é de  %.2f", imc) +
                    "\nClassificação: 'ACIMA DO PESO'");
        } else {
            JOptionPane.showMessageDialog(null, String.format("Seu imc é de  %.2f", imc ) +
                    "\nClassificação: 'OBESO'");
        }

    }
}