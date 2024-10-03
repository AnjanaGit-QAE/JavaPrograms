package anjana;

public class CountNumInAGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int number = 12051999;
		int count=0;
        
		while(number!=0) {
        	
			number = number/10;
        	count++;
        }
		
		System.out.println("Count no-of digits in a given Number is : " + count);
	}

}
