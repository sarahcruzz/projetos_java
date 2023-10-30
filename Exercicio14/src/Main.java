import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        int inicio, fim;

        inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial: "));
        fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final: "));

        // entrada
        for (int contador = inicio; contador <= fim; contador+=3){
            System.out.println(contador);

        }
    }
}