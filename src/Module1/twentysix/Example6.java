package Module1.twentysix;

import java.time.LocalDate;
import java.time.Month;

public class Example6 {
    public static void main(String[] args) {
        // Create a LocalDate object representing the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        // Create a LocalDate object representing a specific date
        LocalDate independenceDay = LocalDate.of(2022, Month.JULY, 4);
        System.out.println("Independence Day: " + independenceDay);

        // Get the year, month, and day of the month
        int year = independenceDay.getYear();
        Month month = independenceDay.getMonth();
        int day = independenceDay.getDayOfMonth();
        System.out.printf("Year: %d, Month: %s, Day: %d\n", year, month, day);

        // Check if a year is a leap year
        boolean isLeapYear = independenceDay.getYear() % 4 == 0 && (independenceDay.getYear() % 100 != 0 || independenceDay.getYear() % 400 == 0);
        System.out.println("Is " + independenceDay.getYear() + " a leap year? " + isLeapYear);

        // Add and subtract days, weeks, and years
        LocalDate oneWeekLater = independenceDay.plusWeeks(1);
        LocalDate oneYearAgo = independenceDay.minusYears(1);
        System.out.println("One week later: " + oneWeekLater);
        System.out.println("One year ago: " + oneYearAgo);

        // Compare two LocalDate objects
        LocalDate todayCopy = LocalDate.now();
        boolean isEqual = today.equals(todayCopy);
        boolean isBefore = today.isBefore(independenceDay);
        boolean isAfter = today.isAfter(independenceDay);
        System.out.println("Is today equal to todayCopy? " + isEqual);
        System.out.println("Is today before Independence Day? " + isBefore);
        System.out.println("Is today after Independence Day? " + isAfter);
    }
}
