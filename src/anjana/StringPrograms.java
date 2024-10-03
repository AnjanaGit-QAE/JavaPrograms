 package anjana;

public class StringPrograms {

	public static void main(String[] args) {
		
        String str="Anjana,SharanyaRaja" ;
        int count=0;
        char ch='a';
        int len=str.length();
        System.out.println("Length of a String is : " + len);
        
        for(int i=0;i<len;i++) {
        	if(str.charAt(i)== ch) {
        		count++;
        	}
        }
        System.out.println("The number of 'a' charecters in a string is :" +count);

        
        
        String[] str1= {"Anjana", "Sharanya","Raja"};
        int len1=str1.length;
        System.out.print("Reverse of a String Array is : ");
        for(int j=len1-1;j>=0;j--) {
        	System.out.print(str1[j]+' ');
        	}
        
        
        
        System.out.println();
       
        System.out.print("Given String is : ");
        String str2= "I Love My Country India";
        String[] words=str2.split(" ");
        int len2=words.length;
        for(int i=0;i<len2;i++) {
        	System.out.print(words[i]+" ");
        }
        
        System.out.println();
        System.out.print("Words Reverse :");
        for(int i=len2-1;i>= 0;i--) {
        	System.out.print(words[i]+" ");
        }
        
        }
	}

