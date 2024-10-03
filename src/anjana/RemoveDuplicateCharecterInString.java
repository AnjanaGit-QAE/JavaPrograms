package anjana;

public class RemoveDuplicateCharecterInString {

	public static void main(String[] args) {
		
		String str = "I am Anjana Sharanya Raja";
        String result = "";
        int len = str.length();
        
        for(int i=0;i<len;i++) {
        	char ch = str.charAt(i);
        	
        	if(result.indexOf(ch)== -1) {
        		result+=ch;
        	}
        }
        System.out.println("After Removing Duplicate Charecters in a String is : "+ result);

	}

}

//The indexOf(ch) method is used to check if the character is already present in the result string.
//If indexOf returns -1, it means the character is not yet in result, and it gets appended.
