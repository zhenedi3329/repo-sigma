	public class TrianglePrinter {
	    public static void printTriangle() {
	        for (int i = 1; i <= 9; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	 
	    public static void main(String[] args) {
	        printTriangle();
	    }
	}