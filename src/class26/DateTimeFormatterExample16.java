package class26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample16 {
    public static void main(String[] args) {
        // Creating a LocalDateTime object representing a specific date and time
        LocalDateTime dateTime = LocalDateTime.of(2023, 7, 15, 14, 30, 0);

        // Formatting the date and time using different patterns
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = dateTime.format(formatter1);
        System.out.println("Formatted date: " + formattedDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter2);
        System.out.println("Formatted date and time: " + formattedDateTime);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        String formattedDateTimeAMPM = dateTime.format(formatter3);
        System.out.println("Formatted date and time with AM/PM: " + formattedDateTimeAMPM);
    }
}
