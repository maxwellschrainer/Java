package Treinamento;
import java.util.Scanner;
public class triângulo
{
    public static void main(String[] args)

    {
        double a,b,c,p;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado A");
        a = scanner.nextDouble();

        System.out.println("Digite o valor do lado B");
        b = scanner.nextDouble();

        System.out.println("Digite o valor do lado C");
        c = scanner.nextDouble();

        scanner.close();
        
        p = a+b+c; 

        System.out.print("O perímetro é: " + p); 
    }
}