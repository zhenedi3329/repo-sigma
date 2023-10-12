	import java.util.Scanner;
	 
	public class LoveMessage {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Введіть ім'я: ");
	        String name = scanner.nextLine();
	 
	        for (int i = 0; i < 10; i++) {
	            System.out.println(name + " любить мене!");
	        }
	    }
	}