import javax.swing.*;

public class Main {
    public static void main(String[] args){
        // declaração de variáveis
        int escolha;

        // criação do menu com as opções
        String[] opcoes = {"The Weekend", "Kyan", "Kweller", "Ryu, the runner", "Sair"};

       // processamento

        do {
            // entrada do usuário
            escolha = JOptionPane.showOptionDialog(null, "Escolha um dos cantores", "Músicas Recomendadas",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[4]);

            if (escolha == 0) {
                JOptionPane.showMessageDialog(null, "Escute 'Call out my name' :>");
            } else if (escolha == 1) {
                JOptionPane.showMessageDialog(null, "Escute 'Primeiro lugar do pódio' :>");
            } else if (escolha == 2) {
                JOptionPane.showMessageDialog(null, "Escute 'Perfume' :>");
            } else if (escolha == 3) {
                JOptionPane.showMessageDialog(null, "Escute 'Março' :>");
            } else {
                JOptionPane.showMessageDialog(null, "bye bye");
            }

        } while (escolha != 4);


    }
}
