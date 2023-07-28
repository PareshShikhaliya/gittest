package Module1.twentysix;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example8 {
    public static void main(String[] args) {
        // Create a LocalDateTime object representing the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // Create a LocalDateTime object representing a specific date and time
        LocalDateTime christmas = LocalDateTime.of(2023, 12, 25, 0, 0);
        System.out.println("Christmas: " + christmas);

        // Format a LocalDateTime object as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a");
        String christmasFormatted = christmas.format(formatter);
        System.out.println("Christmas formatted: " + christmasFormatted);

        // Add and subtract days, hours, minutes, and seconds
        LocalDateTime newYear = christmas.plusDays(7).plusHours(2).plusMinutes(30).plusSeconds(15);
        System.out.println("New Year: " + newYear);

        // Compare two LocalDateTime objects
        LocalDateTime nowCopy = LocalDateTime.now();
        boolean isEqual = now.equals(nowCopy);
        boolean isBefore = now.isBefore(christmas);
        boolean isAfter = now.isAfter(christmas);
        System.out.println("Is now equal to nowCopy? " + isEqual);
        System.out.println("Is now before Christmas? " + isBefore);
        System.out.println("Is now after Christmas? " + isAfter);
    }
}
