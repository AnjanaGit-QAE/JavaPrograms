package anjana;

public class VowelsString {

	public static void main(String[] args) {
		
        String str="Kanchan Anjana Instruments Umbrella Outstanding";
        //str=str.toLowerCase();
        //str=str.toUpperCase();
     
       int len=str.length();
       int count=0;
       
       for(int i=0;i<len;i++) {
    	   char ch=str.charAt(i);
    	   if(ch== 'a' || ch== 'e' || ch== 'i'  || ch== 'o'  || ch== 'u' || ch== 'A'|| ch== 'E'|| ch == 'I'|| ch== 'O' || ch== 'U' ) {
    		   count++;
    	   }
       }
       System.out.println("No of Vowles in a given String is :" + count);
       
       
       System.out.print("Vowels in a given string is : ");
       String name="Anjana Raja";
       int l = name.length();
       String S="";
       
       for(int j=0;j<l;j++) {
    	   char ch = name.charAt(j); 
    	   if (ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
    		    S = S + ch ;
    	   }
       }
       System.out.print(S);
	}
}
