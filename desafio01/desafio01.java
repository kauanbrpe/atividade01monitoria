import java.util.Scanner;

public class desafio01{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String nome;
        
        System.out.print("Qual seu nome? ");
        nome = scanner.next();

        System.out.println("Olá " + nome + "! Seja bem-vindo.");

        scanner.close();
    }
}