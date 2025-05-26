import java.util.Scanner;

public class desafio02{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int s;

        System.out.print("Digite o primeiro número: ");
        a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        b = scanner.nextInt();

        s = a + b;

        System.out.println("A soma dos números é " + s);

        scanner.close();
    }

}