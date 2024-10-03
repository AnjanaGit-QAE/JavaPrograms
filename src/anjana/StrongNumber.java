package anjana;

public class StrongNumber {

	
   public static boolean StrongNumber(int num) {
		
		int originalNumber=num;
		int sum=0,rem;
		while(num!=0) {
			rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		return sum == originalNumber;
	}


	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	
	public static void main(String[] args) {
		
		// The number entered is 145.
		// The sum of the factorials of 1, 4, and 5 is 1, 24, and 120.
		// The total of these factorials equals 1 + 24 + 120 = 145.

		// As we can see, the sum of the factorials and the input value are both the same. 
		// Hence, 145 is a strong number.
		
		int number=145; //534
		if(StrongNumber(number)) {
			System.out.println(number+" "+"is a Strong Number");
		}
		
		else {
			System.out.println(number+"is not a Strong Number");
		}
		

	}

}
