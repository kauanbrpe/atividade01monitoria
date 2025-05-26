import java.util.Scanner;

public class desafio04{
    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
      String nome;
      int idade;
      String cidade;

      System.out.print("Qual seu nome? ");
      nome = scanner.next();

      System.out.print("Qual sua idade? ");
      idade = scanner.nextInt();

      System.out.print("Qual sua cidade? ");
      cidade = scanner.next();

      System.out.print(nome + " tem " + idade + " anos e mora em " + cidade);
      
      scanner.close();

    }

}