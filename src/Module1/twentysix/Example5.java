package Module1.twentysix;
import java.util.Calendar;
import java.util.Date;

public class Example5 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Create a Calendar object

        // Get the current date and time
        Date currentDate = calendar.getTime();
        System.out.println("Current Date and Time: " + currentDate);

        // Get the year, month, and day of the month
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.printf("Year: %d, Month: %d, Day: %d\n", year, month, day);

        // Get the day of the week and time zone
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String timeZone = calendar.getTimeZone().getID();
        System.out.printf("Day of the Week: %d, Time Zone: %s\n", dayOfWeek, timeZone);

        // Get the maximum value for a field
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Maximum Days in Month: " + maxDayOfMonth);

        // Compare two calendar objects
        Calendar otherCalendar = Calendar.getInstance();
        otherCalendar.set(Calendar.YEAR, 2022);
        otherCalendar.set(Calendar.MONTH, Calendar.APRIL);
        otherCalendar.set(Calendar.DAY_OF_MONTH, 22);
        boolean isBefore = calendar.before(otherCalendar);
        boolean isAfter = calendar.after(otherCalendar);
        System.out.println("Is before other calendar? " + isBefore);
        System.out.println("Is after other calendar? " + isAfter);
    }
}
