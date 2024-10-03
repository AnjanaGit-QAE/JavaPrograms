package assignments;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Check Given String is palinfrome or not ");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String : ");
       String str=sc.nextLine();
       char[] chararr=str.toCharArray();
       String rev="";
       int len=chararr.length;
       for(int i=len-1;i>=0;i--) {
    	   rev=rev+chararr[i];
       }
       System.out.println("Reverse of a given String is: " + rev);
       if(rev.equals(str)) {
    	   System.out.println("Given String is a Palindrome String : "+ str);
       }
       else {
    	   System.out.println("Given String is not a Palindrome String : "+ str);
       }
       
       
       
       // Another Method
       System.out.println();
       String s="mom";
       int len1=s.length();
       String rev1="";
       System.out.println("Given String is : " + s);
       for(int i=len1-1;i>=0;i--) {
    	   rev1=rev1+s.charAt(i);
       }
       System.out.println("Reverse of a given String is : "+rev1);
       if(rev1.equals(s)) {
    	   System.out.println("Given String is a Palindrome String : "+ s);
       }
       else {
    	   System.out.println("Given String is not a Palindrome String : "+ s);
       }
       
	}

}
