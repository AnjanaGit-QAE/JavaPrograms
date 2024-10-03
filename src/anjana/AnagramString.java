package anjana;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		
          String str1 = "Raja";
          String str2 = "jaRa";
          
          if(str1.length() == str2.length()) {
        	  
        	  char[] c1 = str1.toCharArray();
              char[] c2 = str2.toCharArray();
              
              Arrays.sort(c1); //aajR
              Arrays.sort(c2); //aagR
              
              boolean result = Arrays.equals(c1,c2);
              
              if(result == true) {
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
