import java.util.Scanner;

public class desafio09{

	public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String nome;
        String profissao;
        int idade;

        System.out.print("Nome: ");
        nome = scanner.next();

        System.out.print("Profissão: ");
        profissao = scanner.next();

        System.out.print("Idade: ");
        idade = scanner.nextInt();

        System.out.println("-------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Profissão: " + profissao);
        System.out.println("Idade: " + idade + " anos");


        scanner.close();
	}
}