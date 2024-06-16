/*
 4 - Crie um algoritmo que calcule o tempo de uma viagem, recebendo do usuário a informação da distância entre os pontos de partida e chegada e a velocidade média de viagem. Por fim, imprima o tempo na tela.
*/
package Faculdade;

import java.util.Scanner;

public class forumex004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String local1, local2;
        double distância, velocidade, tempo; 

        System.out.println("Digite o nome de dois locais, a distância entre estes dois locais e a velocidade média para chegar de um ponto ao outro.");

        System.out.println("Digite o nome do primeiro local: ");
        local1 = scanner.nextLine();

        System.out.println("Digite o nome do segundo local: ");
        local2 = scanner.nextLine();        

        System.out.println("Digite qual é a distância em quilômetros entre estes dois locais: ");
        distância = scanner.nextDouble();

        System.out.println("Digite a velocidade média em quiômetros para a locomoção entre estes dois locais: ");
        velocidade = scanner.nextDouble();

        System.out.println("Com base nestas informações, a locomoção entre estes dois locais levará em média ");

    }
}
