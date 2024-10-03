package anjana;

import java.util.Scanner;

public class SentenceReverseUsingRecursion {
      // performing using Recursion
	  
	public static String reverse(String sentence) {
		 
		if(sentence.isEmpty()) {
			return "";
		}
		
		return sentence.charAt(sentence.length()-1)+reverse(sentence.substring(0,sentence.length()-1));
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence : ");
		String sentence = sc.nextLine();
		
		System.out.println("Reverse of a Sentence is : " + reverse(sentence));
		
	}

}
