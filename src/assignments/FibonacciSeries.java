package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=5;
      int n1=0, n2=1,n3;
      System.out.print(n1+" "+n2+" ");
      for(int i=0;i<=num;i++) {
    	  n3=n1+n2;
    	  System.out.print(n3+" ");
    	  n1=n2;
    	  n2=n3;
      }
	}

}
