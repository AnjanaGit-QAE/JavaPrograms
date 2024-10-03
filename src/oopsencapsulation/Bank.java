package oopsencapsulation;

public class Bank extends BankDetails {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B=new Bank();
		
		System.out.println(B.Name);
		System.out.println(B.BankName);
	    B.setBankPin(1999);
		System.out.println(B.getBankPin());

	}

}
