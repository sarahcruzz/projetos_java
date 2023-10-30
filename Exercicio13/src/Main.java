import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int contador = 0, idade = 0, maior;

        // inicialização da variável maior
        maior = idade;

        //processamento com laço de repetição
        do {
            // entrada da idade
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade: "));
            contador += idade;

            if (idade > maior){
                maior = idade;
            }

        } while (contador <= 100);

        // saída
        JOptionPane.showMessageDialog(null, "O valor da soma das idades ultrapassou de 100!" +
                "\nA pessoa mais velha tem: " + maior);
    }
}