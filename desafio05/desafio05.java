import java.util.Scanner;

public class desafio05{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double b;
        double a;
        double aa;

        System.out.print("Quanto é a base? ");
        b = scanner.nextDouble();

        System.out.print("Quanto é a altura? ");
        a = scanner.nextDouble();

        aa = b*a;

        System.out.println("A área desse retângulo é de " + aa);

        scanner.close();
    }

}
    


