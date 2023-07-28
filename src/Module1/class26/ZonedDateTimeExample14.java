package Module1.class26;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample14 {
    public static void main(String[] args) {
        // Creating a ZonedDateTime object representing the current date and time in a specific time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        // Displaying the current date and time with time zone
        System.out.println("Current date and time: " + zonedDateTime);

        // Accessing individual components of the date and time
        int year = zonedDateTime.getYear();
        int month = zonedDateTime.getMonthValue();
        int day = zonedDateTime.getDayOfMonth();
        int hour = zonedDateTime.getHour();
        int minute = zonedDateTime.getMinute();
        int second = zonedDateTime.getSecond();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Modifying the date and time
        ZonedDateTime modifiedDateTime = zonedDateTime.plusDays(1).minusHours(2);

        System.out.println("Modified date and time: " + modifiedDateTime);

        // Converting to a different time zone
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkDateTime = zonedDateTime.withZoneSameInstant(newYorkZone);

        System.out.println("Date and time in New York: " + newYorkDateTime);

        // Formatting the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}
