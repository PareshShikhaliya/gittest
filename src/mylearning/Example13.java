package mylearning;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;



public class Example13 {
    public static void main(String[] args) {
        // Set the time zone to "Asia/Kolkata"
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        formatter.setTimeZone(timeZone);

        // Create a Date instance with the current date and time in India
        Date indiaTime = new Date();

        // Format the date and time string
        String formattedDateTime = formatter.format(indiaTime);

        // Print the formatted date and time string
        System.out.println("Current date and time in India: " + formattedDateTime);
    }
}
