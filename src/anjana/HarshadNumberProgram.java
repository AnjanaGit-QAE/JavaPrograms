package anjana;

public class HarshadNumberProgram {

	public static void main(String[] args) {
		
		// A number is said to be the Harshad number if it is divisible by the sum of its digit.

		// For example, if number is 156, then sum of its digit will be 1 + 5 + 6 = 12. 
		// Since 156 is divisible by 12. So, 156 is a Harshad number.

		int num=156; // 18
		int sum=0,rem;
		int originalNumber=num;
		
		while(num>0) {
			
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		
		System.out.println("sum of Given number is : " + sum);
		
		if(originalNumber % sum == 0) {
			System.out.println(originalNumber + " "+ "is a Harshad Number ");
		}
		
		else {
			System.out.println(originalNumber + " "+ "is not a Harshad Number ");
		}
	}

}
