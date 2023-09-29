import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter four numbers:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        int smallestNumber = Math.min(Math.min(number1, number2), Math.min(number3, number4));

        System.out.println("samoe melkoe: " + smallestNumber);
    }
}
