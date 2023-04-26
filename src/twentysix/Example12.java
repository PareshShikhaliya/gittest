package twentysix;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Calendar;
import java.util.TimeZone;

public class Example12 {
    public static void main(String[] args) {
        // Get a Calendar instance based on the current time in the default time zone
        Calendar calendar = Calendar.getInstance();

        // Set the time zone to "America/New_York"
        TimeZone timeZone = TimeZone.getTimeZone("America/Denver");
        calendar.setTimeZone(timeZone);

        // Get the current hour and minute in the "America/New_York" time zone
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Print the current time in the "America/New_York" time zone
        System.out.printf("Current time in New York: %02d:%02d", hour, minute);
    }
}
