package anjana;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharecters {

	public static void main(String[] args) {
		
		String str = "I am Anjana Sharanya Raja";
		int len = str.length();
	
		Set<Character> uniqueChars = new HashSet<>();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			{
			   uniqueChars.add(ch);
			}
		}
		
    System.out.println("Unique Charecters in a given String is : " + uniqueChars  );
	}

}


/*
 * package anjana;
 * 
 * import java.util.LinkedHashSet; import java.util.Set;
 * 
 * public class StringUniqueCharacters {
 * 
 * public static void main(String[] args) {
 * 
 * String str = "I am Anjana Sharanya Raja"; int len = str.length();
 * 
 * // Using LinkedHashSet to maintain the insertion order Set<Character>
 * uniqueChars = new LinkedHashSet<>();
 * 
 * for (int i = 0; i < len; i++) { char ch = str.charAt(i);
 * 
 * // Add the character only if it's not a space if (ch != ' ') {
 * uniqueChars.add(ch); } }
 * 
 * // Build the result by appending unique characters String result = ""; for
 * (char ch : uniqueChars) { result += ch; }
 * 
 * System.out.println("Unique Characters in a given String is : " + result); } }
 */

