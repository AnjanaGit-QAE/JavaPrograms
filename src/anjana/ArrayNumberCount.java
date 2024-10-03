package anjana;

import java.util.HashMap;

public class ArrayNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1,2,3,4,5,4,3,2,0,1,1,2,6,7,8,9,6,7,8,10,12};
		int len = arr.length;
		
		HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
		
		for(int i=0;i<len; i++) {
			
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], ++count);
			}
			
			else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map);
		
	}

}
