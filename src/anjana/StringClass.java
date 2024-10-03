package anjana;

public class StringClass {

	public static void main(String[] args) {
		
         int a=12; 
         int b=22;
         int c= a+b;
         System.out.println(c);
         System.out.println(a);
         a+=10;//  here we are adding value to the 'a' again means "int" is a "mutable" so, we can add other value
         System.out.println(a);
         
         float f1=12.45f;
         float f2=23.4456f;
         float f3=f1-f2;
         System.out.println();
         System.out.println(f3);
         System.out.println(f1);
         f1-=10;  // here "float" also "mutable" we can add or modify the value
         System.out.println(f1);
         
         //string is an immutable we can't change value
         
         String s="Anjana";
         s+="Raja";
         System.out.println();
         System.out.println(s); 
         
         System.out.println();
         String str1="Dad";
         String str2="Dad";
         if(str1 == str2) {
        	 System.out.println("Both Strings are Equal"); 
         }
         else {
        	 System.out.println("Both Strings are not Equal");
         }
         
         System.out.println();
         String s1 = new String("Sharanya");
         System.out.println(s1);
         System.out.println(s1.charAt(3));
         System.out.println(s1.startsWith("S"));
         System.out.println(s1.compareTo(s)); // comparing first characters in both strings s1=S(19) s=A(1) then 19-1=18
         System.out.println(s1.concat("Anjana").concat("Raja"));
         System.out.println(s1.contains("z"));
         System.out.println(s1.contentEquals("Sharana"));
         System.out.println(s1.endsWith("a"));
         System.out.println(s1.equals(s1));
         System.out.println(s1.equals(s));
         System.out.println(s1.equalsIgnoreCase(s));
         System.out.println(s1.equalsIgnoreCase(s1));
         System.out.println(s1.isBlank());
         System.out.println(s1.isEmpty());
         System.out.println(s1.lastIndexOf('a'));// for 's' it is '-1' as s is not an last index of a given string, consider 'a' it give index value of char 'a' i.e 7 as it is present in last index of a string.
         System.out.println(s1.length());
         System.out.println(s1.replace('r',' '));
         System.out.println(s1.replace('r','s'));
         System.out.println(s1.toCharArray());
         System.out.println(s1.toLowerCase());
         System.out.println(s1.toUpperCase());
         System.out.println(s1.trim());
         
         String S1 = new String("abc");
         String S2 = new String("abc");

         System.out.println(S1==S2);
         System.out.println(S1.equals(S2));
         
	}

}
