import java.util.Scanner;

public class desafio08{

	public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String produto;
        double preco;
        int quantidade;
        double total;

        System.out.print("Produto: ");
        produto = scanner.next();

        System.out.print("Preço: ");
        preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        quantidade = scanner.nextInt();

        total = quantidade * preco;

        System.out.println("Produto: " + produto + "| Preço: " + preco + " | Quantidade: " + quantidade + " | Total: " + total);

        scanner.close();

	}
}