
public class questionario15 {

    public static void main(String[] args) {
        int[][] matriz = new int[8][8];

        // Código para preenche a matriz com a soma do índice da linha e da coluna
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = i + j;
            }
        }

        // Código para imprimir a matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
