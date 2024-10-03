 package anjana;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		
		//Armstrong Number 
		//number=1634 here n=4 so, (1*4)+(6*4)+(3*4)+(4*4)=1634  so, we need to perform rem*rem*rem*rem as 4 times.
	    //number=153 here n=3 so, (1*3)+(5*3)+(3*3)=153  so, we need to perform rem*rem*rem as 3 times.
		// All two digit numbers are not Armstrong Number Ex: 22 n=2 so, (2*2)+(2*2)=8
		// All one digit numbers are Armstrong Numbers  1,2,3,4,5,6,7,8,9 here n=1 so, Ex: 9  ==> (9*1)=9 we need to perform rem as only 1 time.
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number=sc.nextInt(); // 153 //1634 //371
        
        int OriginalNumber= number;
        int result = 0,rem;
        
        while(number!=0) {
        	rem=number%10;
        	result= result+(rem*rem*rem);
        	number=number/10;
        }
        
        if(OriginalNumber == result) {
        	System.out.println("It is Amstrong Number : "+ result);
        }
        else {
        	System.out.println("It is not a Amstrong Number : "+ result);
        }
	}
	

}
