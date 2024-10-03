package anjana;

public class FibonacciSeries { // without using recursion

	public static void main(String[] args) {
		
		
		
		// Fibonacci series w/o using recursion
		
        int number=5; //0 1 2 3 4 5 
        
        int n1=0; //25
        int n2=1; //26
        int n3;
        System.out.print(n1 + " "+ n2+" ");
        for(int i=2;i<=number;i++) {
        	n3=n1+n2; //0+1=1 //1+1=2
        	System.out.print(n3 +" "); //0 1 1 //2 //3 //5
        	n1=n2; //1 //
        	n2=n3; //1 //2
        }
        
        
	}

}
