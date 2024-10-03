package assignments;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Armstrong Number 
		//number=1634 here n=4 so, (1*4)+(6*4)+(3*4)+(4*4)=1634  so, we need to perform rem*rem*rem*rem as 4 times.
		//number=153 here n=3 so, (1*3)+(5*3)+(3*3)=153  so, we need to perform rem*rem*rem as 3 times.
		// All two digit numbers are not Armstrong Number Ex: 22 n=2 so, (2*2)+(2*2)=8
		// All one digit numbers are Armstrong Numbers  1,2,3,4,5,6,7,8,9 here n=1 so, Ex: 9  ==> (9*1)=9 we need to perform rem as only 1 time
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
        int number=sc.nextInt();  // 153 //1634 //371
        int result=0,rem;
        int OriginalNumber=number;
        while(0<number) { //0<1634
        	rem=number%10;
        	result=result+ (rem*rem*rem*rem); // If Number is an 1634 then no of digits is '4' so, we need to multiply with four times
        	number=number/10;
        }
        if(OriginalNumber == result) {
        	System.out.println("It is Armstrong Number : "+ result);
        }
        else {
        	System.out.println("It is not a Armstrong Number : "+ result);
        }
	}

}
