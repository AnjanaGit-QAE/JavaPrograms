package assignments;

public class PrintingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int start=0; int End=100;
		 */
		
		String str="          ";  // 10 spaces
		int len=str.length();  // 10
		int total=len*len; // 10*10 =100
		String str1=" "; // 1 space
		int len1=str1.length(); // 1
        for(int i=len1;i<=total;i++) { // i=1;i<=100;i++
        	System.out.print(i+ " ");   // printings numbers from 1 to 100.
        }
        
	}

}
