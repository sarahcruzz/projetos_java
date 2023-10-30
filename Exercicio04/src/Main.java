import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double preco, quarta, fds;

        // objeto da classe Scanner
        Scanner leia = new Scanner(System.in);

        // entradas
        System.out.println("Informe o preço do ingresso de cinema: ");
        preco = leia.nextDouble();

        // processamento
        quarta = preco - (preco * 0.10);
        fds = preco + (preco * 0.05);

        // saída
        System.out.println("Preço do ingresso: R$ " + preco +
                "\nValor de Quarta-Feira: R$ " + quarta +
                "\nValor aos fins de semana: R$ " + fds);
    }
}