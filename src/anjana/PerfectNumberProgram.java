package anjana;

public class PerfectNumberProgram {

	
	public static boolean PerfectNumber(int number) {
		
		int sum=0;
		for(int i=1;i<=number/2;i++) {
			if(number % i==0) {
				sum=sum+i;
			} 
		}
		return sum == number ;
	}
	

	public static void main(String[] args) {
		
		// Let's take the number 496 and check it is a perfect number or not.

		// First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248. 
		// Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496).
		// We observe that the sum of factors is equal to the number itself.
		// Hence, the number 496 is a perfect number. Similarly, we can check other numbers also.
		
		int number=28; // 496
		
		if(PerfectNumber(number)) {
			System.out.println(number +" "+"is a Perfect Number");
		}
		
		else {
			System.out.println(number +" "+"is  not a Perfect Number");
		}

	}

}
