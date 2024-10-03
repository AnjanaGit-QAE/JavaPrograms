package anjana;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
        int number=sc.nextInt();
        
        int result=0,rem;
        int originalnumber=number;
        
        while(number!=0) {
        	rem=number%10;
        	result=(result*10)+rem;
        	number=number/10;
        	
        }
        
        if(originalnumber == result) {
        	System.out.println("It is a Palindrome Number");
        }
        else {
        	System.out.println("It is not a Palindrome Number");
        }
        
	}

}
