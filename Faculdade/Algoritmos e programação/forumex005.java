import java.util.Scanner;

public class forumex005 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){

            float nota1, nota2;

            System.out.println(" Digite a sua primeira nota.");
            nota1 = scanner.nextFloat();

            if (nota1 > 100){
            System.out.println("Sua nota não pode ser maior do que 100, digite novamente.");
            }
            nota1 = scanner.nextFloat();

            System.out.println("Digite a sua segunda nota");
            nota2 = scanner.nextFloat();

            if (nota2 > 100){
                System.out.println("Sua nota não pode ser maior do que 100, digite novamente.");
            }
            nota2 = scanner.nextFloat();

            System.out.println("Sua primeira nota foi: " + nota1);

            System.out.println("E sua segunda nota foi: " + nota2);
        }
    }
}
