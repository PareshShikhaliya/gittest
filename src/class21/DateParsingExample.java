package class21;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsingExample {
    public static void main(String[] args) {
        String dateString = "2023-06-22";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // Parse the string into a Date object
            Date date = dateFormat.parse(dateString);
            System.out.println("Parsed date: " + date);
        } catch (ParseException e) {
            // Handle the exception
            System.out.println("An error occurred while parsing the date: " + e.getMessage());
        }
    }
}
