package class26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample13 {
    public static void main(String[] args) {
        // Creating a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.now();

        // Displaying the current date and time
        System.out.println("Current date and time: " + dateTime);

        // Accessing individual components of the date and time
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int second = dateTime.getSecond();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Modifying the date and time
        LocalDateTime modifiedDateTime = dateTime.plusDays(1).minusHours(2);

        System.out.println("Modified date and time: " + modifiedDateTime);

        // Comparing date and time
        LocalDateTime otherDateTime = LocalDateTime.of(2023, 12, 31, 23, 59, 59);

        if (dateTime.isBefore(otherDateTime)) {
            System.out.println(dateTime + " is before " + otherDateTime);
        } else if (dateTime.isAfter(otherDateTime)) {
            System.out.println(dateTime + " is after " + otherDateTime);
        } else {
            System.out.println(dateTime + " is the same as " + otherDateTime);
        }

        // Formatting the date and time
        String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Formatted date and time: " + formattedDateTime);
    }
}

