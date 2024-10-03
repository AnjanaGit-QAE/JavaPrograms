package anjana;

import java.util.HashMap;
import java.util.Map;

public class PracticeSpace {

	public static void main(String[] args) {
		
     
		String str="Anjana Sharanya" ;
		int len = str.length();
		HashMap<Character,Integer> map = new HashMap();
		
		for(int i=0;i<len;i++) {
			if(map.containsKey(str.charAt(i))) {
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}
			
			else {
				map.put(str.charAt(i),1);
			}
		}
		System.out.println(map);
	}

}
