import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double preco, a_vista, parcelado;

        // objeto da classe Scanner
        Scanner leia = new Scanner(System.in);

        // entradas
        System.out.println("Informe o preço do produto: ");
        preco = leia.nextDouble();

        // processamento
        a_vista = preco - (preco * 0.10);
        parcelado = preco / 3;

        // saída
        System.out.println("Valor original: R$" + preco +
                " reais \nÀ vista: R$" + a_vista +
                " reais \nParcelado em 3x s/ juros: R$ " + parcelado + " cada");
    }
}