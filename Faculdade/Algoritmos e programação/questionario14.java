
public class questionario14 {

    public static void main(String[] args) {
        // Tamanho da matriz
        int tamanho = 10;
        // Criação da matriz 10x10
        int[][] matriz = new int[tamanho][tamanho];

        // Preenchimento da matriz com o número 1
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = 1;
            }
        }

        // Impressão da matriz formatada..
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
