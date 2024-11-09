import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroSorteado = random.nextInt(101); // Gera um número entre 0 e 100
        int tentativas = 0;
        int palpite;

        System.out.println("Um número de 0 a 100 foi sorteado, dúvido você descobrir qual é!");

        do {
            System.out.print("Digite um número: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número que você digitou é menor que o número sorteado.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número que você digitou é maior que o número sorteado.");
            } else if (tentativas < 10){
                System.out.println("Nossa, você descobriu em apenas " + tentativas + " tentativas, parabéns!");
            } else {
                System.out.println("Você descobriu em " + tentativas + " tentivas, demorou, ein?");
            }
        } while (palpite != numeroSorteado);

        scanner.close();
    }
}