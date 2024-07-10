
import java.util.Scanner;

public class questionario12 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] numeros = new int[10];
            int pares = 0;
            int impares = 0;

            System.out.println("Digite dez número inteiros");

            for (int i = 0; i < 10; i++) {
                numeros[i] = scanner.nextInt();
            }

            for (int i = 0; i < 10; i++) {
                if (numeros[i] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);
        }
    }
}
