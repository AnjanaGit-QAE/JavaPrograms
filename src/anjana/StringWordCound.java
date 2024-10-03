package anjana;

public class StringWordCound {

	public static void main(String[] args) {
		
         String str= " Hello Anjana Sharanya Raja";
         String[] words=str.split("\\s+");  // Split the string into an array of words based on whitespace characters
         int len=words.length;
         
         System.out.println("Given String is: "+str);
         System.out.println("Words count is :"+len);
         
         System.out.println("**************************");
         
         // Another Method 
         
         String[] word=str.split(" ");
         int len1=word.length; 
         
         System.out.println("Given String is: "+str);
         System.out.println("Words count is :"+len1);
	}

}
