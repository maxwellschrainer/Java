package Faculdade;

import java.util.Scanner;

public class questionario05 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int senha = 10121985;
        int diaNascimento = 10;
        int mesNascimento = 12;
        int anoNascimento = 1985;
        int dataNascimento = diaNascimento + mesNascimento + anoNascimento, senhaDigitada; 

        System.out.println("Digite sua senha numérica de 8 dígitos:");
        senhaDigitada = scanner.nextInt();

        scanner.close();

        if(senha == senhaDigitada){
            System.out.println("Seu acesso foi liberado");
        if(senha == dataNascimento){
            System.out.println("Senha insegura, por favor, troque sua senha.");
            } 
            else{
                System.out.println("Sua senha está incorreta");
            }
        }
    }
    
}
