package assignments;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str1="like";
        String str2="keil";
        if(str1.length()== str2.length()) {
          char[] ch1=str1.toCharArray();
          char[] ch2=str2.toCharArray();
          Arrays.sort(ch1);  //eikl
          Arrays.sort(ch2);  //eikl
          boolean result=Arrays.equals(ch1, ch2);
          
          if(result==true) {
        	  System.out.println("Yes!! Both Strings are Anagram");
          }
          
          else {
        	  System.out.println("No!! Both Strings are not Anagram");
          }
          
        }
        
        
        else { 
        	 System.out.println("Given Strings are not Anagram");
        }
	}

}
