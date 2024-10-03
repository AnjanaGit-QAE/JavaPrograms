package anjana;

public class ConditionalStatements {
	
	//Initializations, sysout and other statements shouldn't placed outside methods
	public void condstmts1() {
		int checkup =5 ;
		for(int check = 0;check<=10;check++){
		if(checkup == check)
		{
			System.out.println("You can meet Doctor.");
			break;
		}
		else
		{
			System.out.println("wait for Sometime"+' '+check);
		}
	  }
	}
	
	public void condstmts2() {
		System.out.println();
		char[] lnames = new char[] {'R','A','J','A'};
		int  len=lnames.length;
		for(int s=0;s<len;s++) {
			System.out.println(lnames[s]);
		}
	}
		
	public void condstmts3() {
		System.out.println();
		String[] names = new String[] { "Anjana","Sharanya","Raja","Lavanya","Siddu","Rohith","Virat"};
		int len1=names.length;
		for(int i=0;i< len1;i++) {
			if(names[i].equals("Virat"))
			{
				System.out.println("Doctor is calling you"+' '+names[i]);
			}
			/*else
			{
				System.out.println("Wait In Lobby for sometime" +' ' +names[i]);
			}  */
		}
	}

	public void condstmts4() {
		System.out.println();
		int checkup1= 12;
		while(checkup1 > 10) { // 12<=10
			System.out.println("Loop is working");
		    checkup1--;
		}
	}
	
	// System.out.println(" working");
    
	public void condstmts5() {
		System.out.println();
		while(true) {
			System.out.println("Appointment Fixed");
			break;
		}
	}
	
	public void condstmts6() {
		System.out.println();
		int [] numbers = new int[] {15,14,17,20,12,27,02,18,12,14};
		int len3= numbers.length;
		for(int num=0; num<len3;num++) 
		{
			System.out.println("Your Appointment number is" +' '+numbers[num]);
		}
	
	}
	
	public void condstmts7() {
		System.out.println();
		float [] numbers1 = new float[] {15.98f,14.67f,17.45f,20.66f,12.5f,27,55f,02.34f,18f,12.00f,14.09f};
		int len4= numbers1.length;
		for(int num1=0; num1<len4;num1++) 
		{
			System.out.println("You Appointment number is" +' '+numbers1[num1]);
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionalStatements cs = new ConditionalStatements();
		cs.condstmts1();
		cs.condstmts2();
        cs.condstmts3();
        cs.condstmts4();
        cs.condstmts5();
        cs.condstmts6();
        cs.condstmts7();
	}

}
