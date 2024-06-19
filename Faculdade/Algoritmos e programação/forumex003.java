/*
3 - Desenvolva um algoritmo que calcule o volume de uma sala a partir da entrada de seus dados: comprimento, largura e altura. 
 */

// Importação do Java
import java.util.Scanner;

public class forumex003 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Variáveis
            double volume, altura, comprimento, largura;

            System.out.println("Vamos calcular o volume de uma sala!");

            System.out.println("Primeiramente, digite quantos metros tem a altura desta sala: ");
            altura = scanner.nextDouble();

            System.out.println("Segundamente, digite quantos metros tem o comprimento desta sala ");
            comprimento = scanner.nextDouble();

            System.out.println("E por último, mas não menos importante, digite quantos metros tem a largura desta sala: ");
            largura = scanner.nextDouble();

            // Variáveis
            volume = altura * comprimento * largura;

            // Conclusão
            System.out.println("De acordo com os dados fornecidos, o volume da sua sala será igual a: "
                    + volume + " metros cúbicos.");

        }
    }
}
