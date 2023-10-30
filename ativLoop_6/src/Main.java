import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int numero, i, soma = 0;

        // entrada do usuário
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o intervalo da soma: "));

        // processamento usando o loop for
        for (i = 0 ; i <= numero; i += 2){
            soma += i;
        }

        // saída
        JOptionPane.showMessageDialog(null, "A soma dos números pares entre o determinado intervalo é " + soma);

    }
}