package anjana;

public class ArraySumElements {

	public static void main(String[] args) {

		   int[] a = {10, 20, 30, 40};
		   int[] b = {50, 30, 40, 60};
		        
		   int len1 = a.length;
		   int len2 = b.length;

		   for (int i = 0; i < len1; i++) {
		           
		       int sum = a[i] + b[len2 - 1 - i]; // 'len1 - 1 - i' gives the opposite index in b
		       System.out.print(sum +" ");  
		  
		   }      
   }

}
