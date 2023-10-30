import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaração de variáveis
        double dias, horas, conversao, totalviagem;

        // objeto da classe Scanner
        Scanner leia = new Scanner(System.in);

        // entrada
        System.out.println("Informe a duração da sua viagem em dias: ");
        dias = leia.nextDouble();
        System.out.println("Agora informe a duração da sua viagem em horas: ");
        horas = leia.nextDouble();

        // processamento
        conversao = dias * 24;
        totalviagem = conversao + horas;

        //saída
        System.out.println("A duração total da viagem foi de " + totalviagem + " horas");



        }
    }
