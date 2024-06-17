/*
 4 - Crie um algoritmo que calcule o tempo de uma viagem, recebendo do usuário a informação da distância entre os pontos de partida e chegada e a velocidade média de viagem. Por fim, imprima o tempo na tela.
*/

// Pasta
package Faculdade;

// Importação do scanner
import java.util.Scanner;

public class forumex004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis
        String local1, local2;
        double distância, velocidade, tempo; 

        System.out.println("Digite o nome de dois locais, a distância entre estes dois locais e a velocidade média para chegar de um ponto ao outro.");

        System.out.println("Digite o nome do primeiro local: ");
        local1 = scanner.nextLine();

        System.out.println("Digite o nome do segundo local: ");
        local2 = scanner.nextLine();        

        System.out.println("São quantos quilômetros entre um local e outro? ");
        distância = scanner.nextDouble();

        System.out.println("Quantos quilômetros por hora é a média na locomoção entre estes dois locais? ");
        velocidade = scanner.nextDouble();

        scanner.close();

        tempo = distância / velocidade;

        System.out.println("Com base nestas informações, a locomoção entre " + local1 + " e " + local2 + " levará em média " + tempo + " horas, caso você não pare para descansar, ir ao banheiro, ou comer.");

    }
}
