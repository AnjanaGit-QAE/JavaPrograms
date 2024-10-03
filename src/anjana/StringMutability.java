package anjana;

public class StringMutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String str = "Hello";

		str = str.concat(" World!");

		System.out.println(str);

		System.out.println(str == "Hello");
		
		String str1="Helloo";
		System.out.println(str == str1);
		
	}

}
