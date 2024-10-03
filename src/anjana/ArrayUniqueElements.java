package anjana;

import java.util.HashSet;

public class ArrayUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr = {1,2,3,3,4,4,2,5};
		int len = arr.length;
		
		HashSet<Integer> uniqueElements = new HashSet<Integer>();
		
		for(int num : arr) {
			uniqueElements.add(num);
		}
		
		System.out.println(uniqueElements +" ");
	}

}
