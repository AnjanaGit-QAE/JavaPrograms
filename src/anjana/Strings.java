package anjana;

public class Strings {

	public static void main(String[] args) {
		
		String s = "Hello";
		int len = s.length();  // Output: 5
		System.out.println("Length of the string is : "+len);
		
		char c = s.charAt(1);  // Output: 'e'
		System.out.println("Charectar at the first index is : "+ c);
		
		String str = "Hello World";
		String sub1 = str.substring(6);          // Output: "World"
		String sub2 = str.substring(0, 5);      // Output: "Hello"
		
		System.out.println(sub1);
		System.out.println(sub2);
		
		String lower = str.toLowerCase();  // Output: "hello world"
		String upper = str.toUpperCase();  // Output: "HELLO WORLD"
		
		String s1 = "Hello";
		String s2 = "hello";
		boolean isEqual = s1.equals(s2);          // Output: false
		boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2);  // Output: true
		
		String newStr = s.replace('l', 'p');  // Output: "Heppo"
		System.out.println("New String is : "+ newStr);
		
		String strg = "   Hello World   ";
		String trimmed = strg.trim();  // Output: "Hello World"
		System.out.println("Trimmed string is : "+ trimmed);
		
		String strgg = "apple,orange,banana";
		String[] fruits = strgg.split(",");  // Output: {"apple", "orange", "banana"}
		
		int index = s.indexOf('l');     // Output: 2
		int indexStr = s.indexOf("lo"); // Output: 3
		
		boolean result = s.contains("World");  // Output: true
		
		boolean starts = str.startsWith("Hello");  // Output: true
		boolean ends = str.endsWith("World");      // Output: true
		
	
		String Result = s1.concat(s2);  // Output: "Hello hello"
		
		String S = "";
		boolean empty = S.isEmpty();  // Output: true
		
		String results = String.join(", ", "apple", "orange", "banana");  // Output: "apple, orange, banana"
        System.out.println(results);
        
        char[] chars = s.toCharArray();  // Output: {'H', 'e', 'l', 'l', 'o'}
		
        String str1 = "abc";
        String str2 = "xyz";
        int comparison = str1.compareTo(str2);  // Output: Negative value (because "abc" comes before "xyz")


	}

}
