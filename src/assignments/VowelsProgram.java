package assignments;

public class VowelsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str=" Anjana Sharanya Raja B-Tech Graduate";
        //String s1=str.toUpperCase();
        //String s1=str.toLowerCase();
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++) { 
        char ch=str.charAt(i);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' ) {
        	count++; //1
        }
      }
        System.out.println("No of Vowels in a given String is : " + count);
	}

}
