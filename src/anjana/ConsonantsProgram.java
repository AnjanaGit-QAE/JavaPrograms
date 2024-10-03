package anjana;

public class ConsonantsProgram {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String str="anjana sharanya";
		int len=str.length();
		String s="";
		
		for(int i=0;i<len;i++) {
			char ch=str.charAt(i);
			if(ch!='a' && ch!='e' && ch!= 'i' && ch!='o' && ch!='u') {
				s = s + ch;
			}
		}
		
		System.out.println("Consonants in a String is :"+s);
		
		        System.out.println();
		        System.out.println("***************  ANOTHER METHOD *************");

		        String str1 = "Anjana Sharanya";
		        int len1 = str1.length();
		        String s1 = "";
		        for (int i = 0; i < len; i++) {
		            char ch1 = str1.charAt(i);
		            
		            // Check if the character is not a vowel and is a letter
		            if (ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u' && ch1 != 'A' && ch1 != 'E' && ch1 != 'I' && ch1 != 'O' && ch1 != 'U' && Character.isLetter(ch1)) {
		                s1 = s1 + ch1;
		            }
		        }
		        System.out.println("Consonants in the string are: " + s);
		 

	}

}




