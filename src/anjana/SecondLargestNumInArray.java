package anjana;

import java.util.Arrays;

public class SecondLargestNumInArray {

	public static void main(String[] args) {
		
		
      int[] arr=new int[] {12,14,17,15,27,22,20};
      int len=arr.length;
      Arrays.sort(arr);
      
      System.out.print("Array Elements are : ");
      for(int i=0;i<len;i++) {
    	  System.out.print(arr[i]+" ");
      }
      
      System.out.println();
      System.out.println("Second Largest Number in an Array is : "+arr[len-2]);
	}

}
