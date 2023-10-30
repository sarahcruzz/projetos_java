import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // declaração de variáveis
        int quantidade, validacao;
        double valor_total, valor_unit;

        // entrada
        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de ingresssos desejados: ", "Compra de Ingressos", JOptionPane.QUESTION_MESSAGE));
        validacao = JOptionPane.showConfirmDialog(null,"O ingresso será para sócios?", "Validação de Ingresso", JOptionPane.YES_NO_CANCEL_OPTION);

        // processamento

        if (validacao == JOptionPane.YES_OPTION) {
            valor_unit = 75.0;
            valor_total = quantidade * valor_unit;
            JOptionPane.showMessageDialog(null, "Valor unitário: R$" + valor_unit +
                    "\nQuantidade: " + quantidade +
                    "\nValor total dos ingressos: R$" + valor_total);

        } else if (validacao == JOptionPane.NO_OPTION){
            valor_unit = 100.0;
            valor_total = quantidade * valor_unit;
            JOptionPane.showMessageDialog(null, "Valor unitário: R$" + valor_unit +
                    "\nQuantidade: " + quantidade +
                    "\nValor total dos ingressos: R$" + valor_total);
        } else {
            JOptionPane.showMessageDialog(null, "       FIM DO PROGRAMA", "Operação Cancelada", JOptionPane.INFORMATION_MESSAGE);
        }





    }
}