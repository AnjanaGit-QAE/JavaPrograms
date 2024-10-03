package anjana;

import java.util.*;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year input : ");
		int year = sc.nextInt();
		
		// Leap year conditions:
        // 1. Year is divisible by 4 but not divisible by 100 (OR)
        // 2. Year is divisible by 400
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is leap Year ");
		}
		
		else {
			System.out.println(year + " is not a leap Year ");
		}
	}

}
