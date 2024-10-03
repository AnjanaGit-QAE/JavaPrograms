package assignments;

public class StringWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="  Anjana Sharanya Raja" ;
        String[] words=str.split(" ");
        int len=words.length;
        System.out.println("Given String is : "+ str);
        System.out.println(" Word Count in a given String is : " + len );
	}

}
