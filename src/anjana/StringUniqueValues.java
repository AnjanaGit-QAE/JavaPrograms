package anjana;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueValues {
    
	public static void main(String[] args) {
        
        String input = "1,1,2,2,3,3,4";
        String[] parts = input.split(",");

        Set<Integer> uniqueValues = new HashSet<>();

        
        for (String part : parts) {
            uniqueValues.add(Integer.parseInt(part));
        }

        System.out.println("Unique values: " + uniqueValues);
   
	}
}
