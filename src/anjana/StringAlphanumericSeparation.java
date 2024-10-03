package anjana;

public class StringAlphanumericSeparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		        String str = "anjana12345";

		        // Using regular expression to split the string
		        String[] parts = str.split("(?<=\\D)(?=\\d)");

		        // parts[0] contains the alphabetic part
		        // parts[1] contains the numeric part
		        
		        System.out.println("Alphabetic part: " + parts[0]);
		        System.out.println("Numeric part: " + parts[1]);
		        
		    }

}
