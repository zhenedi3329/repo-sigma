import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        int bigsigma = num1;

        if (num2 > bigsigma) {
            bigsigma = num2;
        }

        if (num3 > bigsigma) {
            bigsigma = num3;
        }

        System.out.println("The largest number is: " + bigsigma);
    }
}
