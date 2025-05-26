import java.util.Scanner;

public class desafio03{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        double a;
        double b;
        double m;

        System.out.print("Digite o primeiro número: ");
        a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        b = scanner.nextDouble();

        m = (a+b)/2;

        System.out.printf("A média entre %.2f e %.2f é: %.2f%n", a, b, m);

        scanner.close();
    }
}