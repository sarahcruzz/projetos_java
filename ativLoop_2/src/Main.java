import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int num_gerado, num_usuario = 0;

        // objeto da class Random
        Random aleatorio = new Random();

        // atribuição do valor gerado a uma variável
        num_gerado = aleatorio.nextInt(101);

        // processamento usando laço de repetição
        while(num_usuario != num_gerado){

            // entrada
            num_usuario = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o número sorteado: "));

            // processamento
            if (num_usuario == num_gerado){
                JOptionPane.showMessageDialog(null, "Parabéns você acertou!!", "FIM DO JOGO",
                        JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(null, "Você errou, tente novamente.", "O JOGO CONTINUA",
                        JOptionPane.WARNING_MESSAGE);

                // dica para o usuário
                if (num_usuario > num_gerado){
                    JOptionPane.showMessageDialog(null, String.format("Dica: O número gerado é MENOR que %d",
                            num_usuario), "DICA DO JOGO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, String.format("Dica: O número gerado é MAIOR que %d",
                            num_usuario), "DICA DO JOGO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }


    }
}