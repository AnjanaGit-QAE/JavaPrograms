package assignments;

public class StringWordsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="I Love my Family";
          String[] words=str.split(" ");
          int len=words.length;
          System.out.print("Words in a given String is : ");
          for(int i=0;i<len;i++) {
        	  System.out.print(words[i]+" ");
          }
          System.out.println();
          System.out.print("Words Reverse in a given String is: ");
          for(int i=len-1;i>=0;i--) {
        	  System.out.print(words[i]+" ");
          }
	}

}
