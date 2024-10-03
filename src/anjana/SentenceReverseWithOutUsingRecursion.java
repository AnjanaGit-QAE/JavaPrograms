package anjana;

public class SentenceReverseWithOutUsingRecursion {

	
	private static String reversedSentence(String sentence) {
		
		int len = sentence.length();
		String revSentence ="";
		
		for(int i=len-1;i>=0;i--) {
			revSentence = revSentence+sentence.charAt(i);
		}
		
		return revSentence;
			
	}
	
	
	public static void  main(String[] args) {
		
		String sentence = "I am Anjana Sharanya Raja";
		System.out.println("Given Sentence is : " + sentence);
		System.out.println("Reverse of a given  Sentence  is : " + reversedSentence(sentence));
	}

}
