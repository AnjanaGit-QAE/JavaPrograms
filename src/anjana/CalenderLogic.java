package anjana;

import java.util.Scanner;

public class CalenderLogic {
    
    // Function to print the days of the month
    public static void printDays(int month, int year) {
        int daysInMonth ;

        // Determine the number of days in the month
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
           
            case 2: // February
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
           
            default:
                System.out.println("Invalid month!");
               return;
        }

        // Print the days of the month
        System.out.println("Days in month " + month + " of year " + year + ":");
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.print(day + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
      
        System.out.print("Enter year (e.g. 2023): ");
        int year = scanner.nextInt();

        // Print the days in the specified month and year
        printDays(month, year);
        
        scanner.close();
    }
}
