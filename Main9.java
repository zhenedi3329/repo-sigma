	import java.util.Scanner;
	 
	public class SumOfNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int sum = 0;
	        int number;
	 
	        do {
	            System.out.print("Enter a number (-1 to exit): ");
	            number = scanner.nextInt();
	            sum += number;
	        } while (number != -1);
	 
	        System.out.println("Sum of all numbers entered: " + sum);
	    }
	}