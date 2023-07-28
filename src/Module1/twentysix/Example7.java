package Module1.twentysix;

import java.time.LocalTime;

public class Example7 {
    public static void main(String[] args) {
        // Create a LocalTime object representing the current time
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        // Create a LocalTime object representing a specific time
        LocalTime teaTime = LocalTime.of(16, 0);
        System.out.println("Tea time: " + teaTime);

        // Get the hour, minute, and Module1.second
        int hour = teaTime.getHour();
        int minute = teaTime.getMinute();
        int second = teaTime.getSecond();
        int nano = teaTime.getNano();
        System.out.printf("Hour: %d, Minute: %d, Second: %d\n", hour, minute, second);

        // Add and subtract hours, minutes, and seconds
        LocalTime anHourLater = teaTime.plusHours(1);
        LocalTime aMinuteLater = teaTime.plusMinutes(1);
        LocalTime aSecondLater = teaTime.plusSeconds(1);
        System.out.println("An hour later: " + anHourLater);
        System.out.println("A minute later: " + aMinuteLater);
        System.out.println("A Module1.second later: " + aSecondLater);

        // Compare two LocalTime objects
        LocalTime nowCopy = LocalTime.now();
        boolean isEqual = now.equals(nowCopy);
        boolean isBefore = now.isBefore(teaTime);
        boolean isAfter = now.isAfter(teaTime);
        System.out.println("Is now equal to nowCopy? " + isEqual);
        System.out.println("Is now before tea time? " + isBefore);
        System.out.println("Is now after tea time? " + isAfter);
    }
}
