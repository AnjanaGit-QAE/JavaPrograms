package assignments;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Number : ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++) {
        	fact=fact*i;
        }
        System.out.println("The Factorial of a given Number is : "+ fact);
	}

}
