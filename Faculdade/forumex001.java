package Faculdade;

import java.util.Scanner;

public class forumex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, soma, subtração, multiplicação;

        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        num2 = scanner.nextDouble();

        scanner.close();

        soma = num1 + num2;
        subtração = num1 - num2;
        multiplicação = num1 * num2;

        System.out.println("A soma dos dois números é: " + soma);

        System.out.println("A subtração dos dois números é: " + subtração);

        System.out.println("A multiplicação dos dois números é: " + multiplicação);

    }
}