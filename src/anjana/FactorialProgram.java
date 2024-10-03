package anjana;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter you Number : ");
         int num=sc.nextInt();
         
         int factorial=1;
         for(int i=1;i<=num;i++) {
        	 factorial=factorial*i;
         }
         System.out.println("The Factorial of a given Number is : "+ factorial); //not working for big numbers
	}

}
