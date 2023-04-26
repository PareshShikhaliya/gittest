package twentysix;
import java.util.Calendar;
import java.util.Date;

public class Example4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Create a Calendar object

        // Get the current date and time
        Date currentDate = calendar.getTime();
        System.out.println("Current Date and Time by Cal: " + currentDate);



        // Add or subtract time from the calendar
        calendar.add(Calendar.YEAR, -25);
        Date updatedDate = calendar.getTime();
        System.out.println("Updated Date: " + updatedDate);

        // Clear the calendar
        calendar.clear();
       // System.out.println("Cleared Calendar: " + calendar.getTime());
    }
}
