import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // declaração de variáveis
        String nome;
        int idade;
        double passagem, valor;

        // entrada
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        passagem = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da passagem: "));

        // processamento
        if (idade >= 60){
            valor = passagem / 2;
            JOptionPane.showMessageDialog(null, "Nome do passageiro: " + nome +
                    "\nValor da passagem: R$" + valor);
        }else {
            JOptionPane.showMessageDialog(null, "Nome do passageiro: " + nome +
                    "\nValor da passagem: R$" + passagem);
        }
    }
}