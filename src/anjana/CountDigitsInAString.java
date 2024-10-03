package anjana;

public class CountDigitsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str = "Anja23na234shara4567ya";
		int len = str.length();
		int count=0;
		
		for(int i=0;i<len;i++) {
		  
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		
		System.out.println("Digits count in a string is : "+ count);
	}

}
