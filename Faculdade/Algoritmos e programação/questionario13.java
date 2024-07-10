import java.util.Random;
public class questionario13 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100);
        }
        
        // Impressão do vetor criado originalmente
        System.out.println("Vetor original:");
        for (int num : vetor){
            System.out.println(num + " ");
        }
        System.out.println();

        // Impressão do vetor na ordem inversa
        System.out.println("Vetor inverso");
        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
