package Module1.class26;

import java.util.Date;

public class DateExample4 {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date();

        // Get and print the year (relative to 1900)
        int year = date.getYear();
        System.out.println("Year real: " + (year));

        System.out.println("Year: " + (year + 1900));

        // Get and print the month (months are numbered from zero)
        int month = date.getMonth();
        System.out.println("Month: " + (month + 1));

        // Get and print the day of the month
        int day = date.getDate();
        System.out.println("Day: " + day);

        // Get and print the day of the week
        int dayOfWeek = date.getDay();
        System.out.println("Day of the week: " + dayOfWeek);

        // Get and print the hours
        int hours = date.getHours();
        System.out.println("Hours: " + hours);

        // Get and print the minutes
        int minutes = date.getMinutes();
        System.out.println("Minutes: " + minutes);

        // Get and print the seconds
        int seconds = date.getSeconds();
        System.out.println("Seconds: " + seconds);

        // Modify the date by changing specific components
        date.setYear(123); // Change the year (relative to 1900)
        date.setMonth(6); // Change the month (months are numbered from zero)
        date.setDate(15); // Change the day of the month
        date.setHours(12); // Change the hours
        date.setMinutes(30); // Change the minutes
        date.setSeconds(45); // Change the seconds

        // Print the modified date
        System.out.println("Modified date: " + date);
    }
}
