/*
1 - Desenvolva um algoritmo que receba dois números e faça a soma, a subtração e a multiplicação de ambos e imprima na tela os resultados de cada uma destas operações.
 */
// Pasta
package Faculdade;

// Importação do scanner
import java.util.Scanner;

public class forumex001 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Variáveis
            double num1, num2, soma, subtração, multiplicação;

            System.out.println("Digite o primeiro número:");
            num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número");
            num2 = scanner.nextDouble();

            // Contas
            soma = num1 + num2;
            subtração = num1 - num2;
            multiplicação = num1 * num2;

            // Conclusões
            System.out.println("A soma dos dois números é: " + soma);

            System.out.println("A subtração dos dois números é: " + subtração);

            System.out.println("A multiplicação dos dois números é: " + multiplicação);

        }
    }
}
