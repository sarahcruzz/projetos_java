import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int contador = 0, yorno;
        double nota, media, soma_notas = 0;

        // entrada e laço de repetição
        yorno = JOptionPane.showConfirmDialog(null, "Deseja ler uma nota?", "Leitura de Notas", JOptionPane.YES_NO_OPTION);

        while (yorno == 0) {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno: "));
            yorno = JOptionPane.showConfirmDialog(null, "Deseja ler mais uma nota?", "Leitura de Notas", JOptionPane.YES_NO_OPTION);
            contador++;
            soma_notas += nota;
        }

        // processamento
        media = soma_notas / contador;

        // saída
        JOptionPane.showMessageDialog(null, "A quantidade de notas lidas foi: " + contador +
                "\nA média aritmética da sala seria de: " + media );





    }
}