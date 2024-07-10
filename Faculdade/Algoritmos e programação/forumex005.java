
import java.util.ArrayList;
import java.util.Scanner;

public class forumex005 {

    public static void main(String[] args) {
        ArrayList<Float> notas = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {

            float nota1;

            System.out.println(" Digite a sua primeira nota.");
            nota1 = scanner.nextFloat();

            if (nota1 >= 0 && nota1 <= 100) {
                notas.add(nota1);
            }

            System.out.println("Sua nota é: " + nota1);
            System.out.println("Todas as notas: " + notas);
        
            }
        }
    }
