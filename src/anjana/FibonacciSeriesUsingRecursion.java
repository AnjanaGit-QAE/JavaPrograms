package anjana;

public class FibonacciSeriesUsingRecursion {
	
	public static  int fibonacci(int n) {
		
		if(n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
        System.out.print("Fibonacci Series for a given number " + n +" is : ");
		for(int i=0;i<=n;i++) {
			System.out.print(fibonacci(i)+ " ");
		}

	}

}
