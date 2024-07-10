
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Imprime as opções.
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            // Pede do usuário a operação que ele deseja realizar.
            System.out.print("Escolha uma das opções: ");
            int opcao = scanner.nextInt();

            // A partir da opção do usuário o programa executa um dos métodos.
            switch (opcao) {
                case 1 ->
                    metodoAdicao(scanner);
                case 2 ->
                    metodoSubtracao(scanner);
                case 3 ->
                    metodoMultiplicacao(scanner);
                case 4 ->
                    metodoDivisao(scanner);
                default ->
                    System.out.println("Opção inválida");
            }
        }
    }

    // Método de Adição
    public static void metodoAdicao(Scanner scanner) {
        System.out.println("ADIÇÃO");
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    // Método de Subtração
    public static void metodoSubtracao(Scanner scanner) {
        System.out.println("SUBTRAÇÃO");
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    // Método de Multiplicação
    public static void metodoMultiplicacao(Scanner scanner) {
        System.out.println("MULTIPLICAÇÃO");
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    // Método de Divisão
    public static void metodoDivisao(Scanner scanner) {
        System.out.println("DIVISÃO");
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / (double) num2));
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }
    }
}
