package anjana;

import java.util.Scanner;

public class DivisibilityProgram {
   
	public static void main(String[] args) {
      
		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by both 2 and 3.");
        } 
        
        else if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2 but not by 3.");
        }
       
        else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3 but not by 2.");
        } 
        
        else {
            System.out.println(number + " is not divisible by 2 or 3.");
        }

        // Close the scanner
        scanner.close();
    
	}
}

