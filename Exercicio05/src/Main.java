import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double area, raio;
        double pi = 3.14;

        // objeto da classe Scanner
        Scanner leia = new Scanner(System.in);

        // entrada
        System.out.println("Para calcular a área do círculo, informe o raio do mesmo: ");
        raio = leia.nextDouble();

        // processamento
        area = pi * (raio * raio);

        // saída
        System.out.println("A área do círculo é " + area);
    }
}