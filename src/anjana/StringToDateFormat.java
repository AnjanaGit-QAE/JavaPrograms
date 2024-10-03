package anjana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateFormat {

    public static void main(String[] args) {
        
    	// Date string in 'dd-MM-yyyy' format
        String dateString = "12-05-1999";

        // Create a SimpleDateFormat object with the expected date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Convert string to Date
            Date date = dateFormat.parse(dateString);

            System.out.println("Converted Date: " + date);
        }
        
        // the parse() method can throw a ParseException if the string is not in the expected format, we handle it using a try-catch block.
        catch (ParseException e) { 
            System.out.println("Error parsing date: " + e.getMessage());
        }
 

    }
}

