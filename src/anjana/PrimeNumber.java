  package anjana;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// Prime numbers are natural numbers that are divisible by only 1 and the number itself.
		// In other words, prime numbers are positive integers greater than 1 with exactly two factors, 
		// 1 and the number itself. 
		
		
		//Prime number in Java:
		//Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words, prime numbers can't be divided by other numbers than itself or 1. 
		//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
		//Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.
       
		System.out.println("Check weather the given number is Prime Number or Not :");
		int n = 5;
	    int result=0;
	    for(int i=2;i<=n/2;i++) {  // n/2 means it will check up to 12/2=6 iterations (2,3,4,5,6,7)
	    	if(n%i == 0) { //12%2==0,res=1
	    		System.out.println(n+" "+"is not a Prime Number");
	    		result=1;
	    		break;
	    	}
	    }
	    
	    if(result == 0) {
	    	System.out.println(n+" "+" is a Prime Number");
	    }
	    
		
		//Prime Number program in a Given Range
		
		//The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
		//Why is 1 not a prime number? 
		//1 is not a prime number because it has only one factor, namely 1.
		//Prime numbers need to have exactly two factors.
	    
	    System.out.println();
	   
	    System.out.println("Prime Numbers in a given range 1 to 100 is : ");
	    
	    for(int i=1; i<=100;i++) {
	    	int counter=0;
	    	for(int num=i; num>=1;num--) {
	    		if(i%num == 0) {
	    			counter=counter+1;
	    		}
	    	}
	    	
			if(counter==2) {
	    		System.out.print(i +" ");
	    	}
	    }
	   
	}

}
