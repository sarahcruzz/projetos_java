import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        String nome;
        int idade;

        // entrada
        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Nome do Atleta", JOptionPane.QUESTION_MESSAGE);
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: ", "Idade do Atleta", JOptionPane.QUESTION_MESSAGE));

        // processamento

        if (idade < 18){
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome +
                    "\nVocê está na categoria Juvenil", "Categoria do Atleta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome +
                    "\nVocê está na categoria: Adulto", "Categoria do Atleta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}