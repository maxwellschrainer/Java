package Faculdade;

import java.util.Scanner;

public class questionario05 {
    public static void main(String[] args){

        String nome = "João";
        int senha = 10121985;
        int diaNascimento = 10;
        int mesNascimento = 12;
        int anoNascimento = 1985;
        int dataNascimento = diaNascimento + mesNascimento + anoNascimento, senhaDigitada; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha numérica de 8 dígitos:");
        senhaDigitada = scanner.nextInt();
    }
    
}
