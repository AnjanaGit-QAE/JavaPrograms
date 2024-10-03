package anjana;

public class StringSubstringProgram {

	public static void main(String[] args) {
		
		
		String name1 = "I India";
		String name2 = "Love";
		int index = 1;
		// o/p name3 = "I Love India" 
		
		String FirstString = name1.substring(0,index);
		String SecondString = name1.substring(index);
		
		String name3 = FirstString +" "+ name2 + SecondString;
		System.out.println(name3);
		

	}

}
