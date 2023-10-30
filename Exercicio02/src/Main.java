import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double conta, pagar, clientes;

        // objeto da classe Scanner
        Scanner leia = new Scanner(System.in);

        // entrada
        System.out.println("Informe o valor total da conta: ");
        conta = leia.nextDouble();
        System.out.println("Agora informe a quantidade de clientes que irão pagar: ");
        clientes = leia.nextDouble();

        // processamento
        pagar = conta / clientes;

        // saída
        System.out.println("Cada cliente irá pagar um total de R$" + pagar + " reais");
    }
}