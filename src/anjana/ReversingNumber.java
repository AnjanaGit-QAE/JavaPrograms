package anjana;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234;
		int rem,rev=0;
		
		while(num>0) {
			rem = num%10;
			rev =(rev * 10)+rem;
			num = num/10;
		}
		System.out.println("Reverse of a given number is : " + rev);

	}

}
