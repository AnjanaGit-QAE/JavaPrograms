package anjana;

public class FactorsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int num=60;
		System.out.print("The factors of a given number is : ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i +" ");
			}
			
		}
	}

}
