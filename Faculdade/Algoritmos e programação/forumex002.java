/*
2 - Desenvolva um algoritmo que faça o cálculo de quantos dias e meses o usuário já viveu a partir da informação de sua idade. Desconsidere os meses depois do seu último aniversário.
 */

// Importação do Java
import java.util.Scanner;

public class forumex002 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Variáveis
            int idade, meses, dias;

            System.out.println("Digite a sua idade, e então saberei quantos meses e quantos dias você já viveu!");
            idade = scanner.nextInt();

            // Contas
            meses = idade * 12;
            dias = idade * 365;

            // Conclusão
            System.out.println(
                    "De acordo com a sua idade atual, se fossemos calcular o total de meses que você já viveu, seriam "
                    + meses + " meses vividos, e se fossemos calcular o total de dias que você já viveu, seriam "
                    + dias + " dias vividos!");
        }
    }
}
