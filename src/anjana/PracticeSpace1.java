package anjana;

public class PracticeSpace1 {
	

	    public static void main(String[] args) {
	        int num = 1;  // Initialize the number to be printed

	        // Outer loop for each row
	        for (int i = 1; i <= 4; i++) {  // We want 4 rows
	            // Inner loop for the number of elements in each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");  // Print the current number
	                num++;  // Move to the next number
	            }
	            System.out.println();  // Move to the next line after each row
	        }
	    }
	}

