package anjana;

public class StringAlternateCharecters {
	
    public static void main(String[] args) {
        
    	
    	String str = "AnjanaSharanyaRaja";
        
        StringBuilder alternateChars = new StringBuilder();
        StringBuilder remainingChars = new StringBuilder();

        // Loop through the string to collect alternate characters
        for (int i = 0; i < str.length(); i++) {
            
        	if (i % 2 == 0) {
                alternateChars.append(str.charAt(i)); // Collect alternate characters (even index)
            } 
        	
        	else {
                remainingChars.append(str.charAt(i)); // Collect remaining characters (odd index)
            }
        }

        // Combine the alternate and remaining characters
        System.out.println("Original String: " + str);
        System.out.println("Resulting String: " + alternateChars.toString() + remainingChars.toString());
        
    }
}

/*
 * char[] charArr = str.toCharArray(); 
 * int len = charArr.length; String
 * newStr=""; 
 * for(int i=0;i<len;i++)
 * {
 * if(i%2!=0) {
 *      newStr+=charArr[i]; 
 *   } 
 * }
 *   System.out.println("New String is : " + newStr);
 */

