package Module1.class26;

import java.util.Date;

public class DateExample2 {
    public static void main(String[] args) {
        // Create a Date object representing a specific date
        //The specific date in this example
        // is set to 123456789000L milliseconds since January 1, 1970, UTC
        Date specificDate = new Date(1000000000L);

        // Print the specific date
        System.out.println("Specific date: " + specificDate);
    }
}
