package class26;

import java.time.Instant;

public class InstantExample14 {
    public static void main(String[] args) {
        // Creating an Instant object representing the current moment in UTC
        Instant instant = Instant.now();

        // Displaying the current timestamp
        System.out.println("Current timestamp: " + instant);

        // Getting the number of seconds and nanoseconds since the Unix epoch
        // This method returns the number of seconds since the
        // Unix epoch (January 1, 1970, 00:00:00 UTC) for the Instant object.
        long epochSeconds = instant.getEpochSecond();
        int nanoseconds = instant.getNano();

        System.out.println("Epoch seconds: " + epochSeconds);
        System.out.println("Nanoseconds: " + nanoseconds);

        // Creating an Instant from a specific timestamp
        Instant specificInstant = Instant.ofEpochSecond(1625904000);
        System.out.println("Specific instant: " + specificInstant);

        // Comparing instants
        if (instant.isBefore(specificInstant)) {
            System.out.println(instant + " is before " + specificInstant);
        } else if (instant.isAfter(specificInstant)) {
            System.out.println(instant + " is after " + specificInstant);
        } else {
            System.out.println(instant + " is the same as " + specificInstant);
        }

        // Adding or subtracting time to/from an instant
        Instant modifiedInstant = instant.plusSeconds(60).minusMillis(500);
        System.out.println("Modified instant: " + modifiedInstant);
    }
}
