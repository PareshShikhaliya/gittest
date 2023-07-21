package class26;

import java.util.Calendar;

public class Calendar7 {
    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = Calendar.getInstance();

        System.out.println("calendar==="+calendar);

        // Get individual components of the date
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is zero-based, so add 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Display the current date
        System.out.println("Current Date: " + month + "/" + day + "/" + year);

        // Manipulate the date
        calendar.add(Calendar.DAY_OF_MONTH, -7); // Add 7 days
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);

        // Display the manipulated date
        System.out.println("Manipulated Date: " + month + "/" + day + "/" + year);
    }
}
