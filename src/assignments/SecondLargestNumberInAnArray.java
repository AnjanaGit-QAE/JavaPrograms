package assignments;

import java.util.Arrays;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intarr= new int[] {12,14,15,17,27,22,20,07,26};
        int len=intarr.length;
        Arrays.sort(intarr);
        System.out.print("Elements in an Integer Array is: ");
        for(int i=0;i<len;i++) {
        	System.out.print(intarr[i]+" ");
        }
        System.out.println();
        System.out.println("Second Largest Number in an given Array is : "+intarr[len-2]);
	}

}
