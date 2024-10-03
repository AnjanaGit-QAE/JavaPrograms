package anjana;

public class StringAlternateCharecters {
	
    public static void main(String[] args) {
        
    	
    	String str = "AnjanaSharanyaRaja";
        char[] charArr = str.toCharArray();
        int len = charArr.length;
        String newStr="";
       
        
        for(int i=0;i<len;i++) {
        	
        	if(i%2!=0) {
        		newStr+=charArr[i];
        	}
        }
        System.out.println("New String is : " + newStr);
        
    }
}

