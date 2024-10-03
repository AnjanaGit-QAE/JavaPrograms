package anjana;

import java.util.Scanner;

public class EvenNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given number is even number or not
		
		int n=12;
		if(n % 2==0) {
			System.out.println(n+" is Even number");
		}
		else {
			System.out.println(n+" is not a Even number");
		}
		
		System.out.println("***************************");
		
		//  print even number in a given range 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Number");
		int Start = sc.nextInt();
		
		System.out.println("Enter Ending Number");
		int End = sc.nextInt();
		
		System.out.println("Even Numbers in a given range is : ");
		for(int i=Start;i<=End;i++) {
			if(i%2== 0 ) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
