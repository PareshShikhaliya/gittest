package Module1.twentysix;

import java.time.LocalDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example10 {
    public static void main(String[] args) {
        // Create a LocalDateTime object representing the current date and time in UTC
        LocalDateTime utcNow = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current date and time in UTC: " + utcNow);

        // Set the time to 12:00:00 in Los Angeles time zone (PST)
        ZonedDateTime laNoon = ZonedDateTime.of(utcNow, ZoneId.of("America/Los_Angeles"))
                .withHour(12).withMinute(0).withSecond(0);
        System.out.println("Noon in Los Angeles: " + laNoon);
    }
}
