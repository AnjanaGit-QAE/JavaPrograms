package anjana;

import java.util.HashMap;

public class StringCharOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Anjana Sharanya";
		HashMap <Character, Integer> map = new HashMap <Character, Integer> ();
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			
			if(map.containsKey(str.charAt(i))) {
				
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}
			
			else {
				map.put(str.charAt(i),1);
			}
		}
		
		System.out.println(map);

	}

}
