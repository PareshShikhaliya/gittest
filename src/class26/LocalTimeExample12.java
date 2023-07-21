package class26;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample12 {
    public static void main(String[] args) {
        // Creating a LocalTime object
        LocalTime time = LocalTime.now();

        // Displaying the current time
        System.out.println("Current time: " + time);

        // Accessing individual components of the time
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Modifying the time
        LocalTime modifiedTime = time.plusHours(2).minusMinutes(30);

        System.out.println("Modified time: " + modifiedTime);

        // Comparing times
        LocalTime otherTime = LocalTime.of(12, 30, 0);

        if (time.isBefore(otherTime)) {
            System.out.println(time + " is before " + otherTime);
        } else if (time.isAfter(otherTime)) {
            System.out.println(time + " is after " + otherTime);
        } else {
            System.out.println(time + " is the same as " + otherTime);
        }

        // Formatting the time
        String formattedTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Formatted time: " + formattedTime);

    }
}
