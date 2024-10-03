package assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Check Given Number is Prime Number or Not ");
      int n=5,result=0;
      for(int i=2;i<n/2;i++) {
    	  if(n%i==0) {
    		  System.out.println("Given Number is Not a Prime Number : "+ n);
    		  result=1;
    		  break;
    	  }
      }
      if(result == 0) {
    	  System.out.println("Given number is Prime Number : " + n);
      }
      
      //Prime Numbers in a Given Range

      System.out.println("Print Prime Numbers in a given Range 1 to 100 is : ");
      int num=0;
      for(int i=1;i<=100;i++) {
    	  int counter=0;
    	    for(num =i;num>=1;num--) {
    	    	if(i%num==0) {
    	    		counter=counter+1;
    	    	}
    	    }
    	    if(counter==2) {
	    		System.out.print(i +" ");
	    	}
      }
 
	}

}
