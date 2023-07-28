package Module1.class26;

import java.time.LocalDate;

public class LocalDateExample11 {
    public static void main(String[] args) {
        // Create a specific date
        LocalDate date = LocalDate.of(2023, 7, 11);

        // Check if the year is a leap year
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is Leap Year? " + isLeapYear);

        // Get the length of the month in days
        int lengthOfMonth = date.lengthOfMonth();
        System.out.println("Length of Month: " + lengthOfMonth);

        // Get the length of the year in days
        int lengthOfYear = date.lengthOfYear();
        System.out.println("Length of Year: " + lengthOfYear);

        // Check if the date is before another date
        LocalDate otherDate = LocalDate.of(2023, 12, 31);
        boolean isBefore = date.isBefore(otherDate);
        System.out.println("Is Before? " + isBefore);

        // Check if the date is after another date
        boolean isAfter = date.isAfter(otherDate);
        System.out.println("Is After? " + isAfter);

        // Compare two dates
        int comparison = date.compareTo(otherDate);
        System.out.println("Comparison: " + comparison);
    }
}
