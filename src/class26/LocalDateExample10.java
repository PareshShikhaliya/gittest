package class26;

import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.chrono.IsoEra;

public class LocalDateExample10 {
    public static void main(String[] args) {
        // Create a specific date
        LocalDate date = LocalDate.of(2023, Month.JULY, 11);

        // Get the year of the date
        int year = date.getYear();
        System.out.println("Year: " + year);

        // Get the month of the date
        Month month = date.getMonth();
        int monthValue = date.getMonthValue();
        System.out.println("Month: " + month + " (" + monthValue + ")");

        // Get the day of the month
        int dayOfMonth = date.getDayOfMonth();
        System.out.println("Day of Month: " + dayOfMonth);

        // Get the day of the year
        int dayOfYear = date.getDayOfYear();
        System.out.println("Day of Year: " + dayOfYear);

        // Get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);



        // Perform date calculations
        LocalDate updatedDate = date.plusDays(10)
                .plusMonths(2)
                .minusYears(-1);
        System.out.println("Updated Date: " + updatedDate);
    }
}
