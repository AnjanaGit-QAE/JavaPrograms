package anjana;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First Method
		
		StringBuilder sb = new StringBuilder();
		String s1="Anjana";
		sb.append(s1);
		sb.reverse();
		System.out.println("Reverse of a Sring is : " + sb);
		
		// second Method
		
		System.out.println("Check if String is Palindrome or Not using Reversal of A String ");
       
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
       
        String str = sc.nextLine();
        int len=str.length();
       
        String rev = ""; //do not include space
        for(int i=len-1;i>=0;i--) {
        	rev=rev+str.charAt(i);
        }
        
        System.out.println("Reverse of a String is : " + rev);
       
        if(str.equals(rev)) { 
    	   System.out.println("Palindrome String : " + str);
        }
        
        else {
     	   System.out.println("Not a Palindrome String : " + str);
        }
        
        // String Palindrome by converting into char Array
        
        String str1="Mom";
        char[] ch1=str1.toCharArray(); // char[] is used when comparison is req or else we can proceed with "str1.charAt(i)".
        int len1=ch1.length;
       
        String rev1="";
        
        for(int i=len1-1;i>=0;i--) {
        	rev1=rev1+ch1[i];
        }
       
        System.out.println();
       
        System.out.println("Reverse of a String is: "+rev1);
       
        if(str1.equals(rev1)) {
        	System.out.println(" String is a Palindrome : " +str1);
        }
        else {
           System.out.println("Not a Palindrome String : " +str1);
        }
	}

}
