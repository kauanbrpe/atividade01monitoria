import java.util.Scanner;

public class desafio06{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double c;
        double f;

        System.out.print("Digite a temperatura em Celsius: ");
        c = scanner.nextDouble();

        f = (c * 1.8) + 32;

        System.out.print("A temperatura em Celsius na escala Fahrenheit é: " + f);

        scanner.close();
    }
} 