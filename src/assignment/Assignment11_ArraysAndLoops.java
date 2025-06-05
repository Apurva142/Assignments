package assignment;

public class Assignment11_ArraysAndLoops {

	public static void main(String[] args) {
		 int n = 5;

	        // Upper part of the pattern
	        for (int i = 1; i <= n; i++) {
	            // Printing spaces
	            for (int j = n - i; j > 0; j--) {
	                System.out.print(" ");
	            }
	            // Printing numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }

	        // Lower part of the pattern
	        for (int i = n - 1; i >= 1; i--) {
	            // Printing spaces
	            for (int j = n - i; j > 0; j--) {
	                System.out.print(" ");
	            }
	            // Printing numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
    

	}

}
