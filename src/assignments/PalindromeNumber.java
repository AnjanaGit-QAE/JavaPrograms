package assignments;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number : ");
       int number=sc.nextInt();
       int result=0,rem;
       int OriginalNumber=number;
       while(number!=0) {
    	   rem=number%10;
    	   result=(result*10)+rem;
    	   number=number/10;
       }
       if(OriginalNumber == result) {
    	   System.out.println("Given number is a Palindrome Number : "+ OriginalNumber);
       }
       else {
    	   System.out.println("Given number is not a Palindrome Number : "+ OriginalNumber);
       }
	}

}
