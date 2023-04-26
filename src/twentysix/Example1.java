package twentysix;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) {
        // create a new date object with the current date and time
        Date today = new Date();

        // print the date object
        System.out.println(today);

        // get the time in milliseconds since the Unix epoch (January 1, 1970)
        long time = today.getTime();//1682170635450

        // print the time
        System.out.println(time); // Output: 1684527316674

        // create a new date object with a specific date and time
        Date myDate = new Date(123, 11, 25, 12, 0, 0);

        // print the date object
        System.out.println(myDate); // Output: Tue Dec 25 12:00:00 UTC 2022

        // get the year, month, and day of the date object
        int year = myDate.getYear() + 1900;
        int month = myDate.getMonth() + 1; // month is 0-based
        int day = myDate.getDate();

        // print the year, month, and day
        System.out.println(year);  // Output: 2022
        System.out.println(month); // Output: 12
        System.out.println(day);   // Output: 25

        // compare two date objects
        Date otherDate = new Date(123, 0, 1);
        int comparison = myDate.compareTo(otherDate);

        // print the comparison result
        System.out.println(comparison); // Output: -1 (myDate is earlier than otherDate)
    }
}
