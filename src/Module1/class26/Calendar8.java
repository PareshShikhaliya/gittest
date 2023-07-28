package Module1.class26;

import java.util.Calendar;

public class Calendar8 {
    public static void main(String[] args) {
        // Create a Calendar instance and set it to a specific date
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JULY, 10); // July is represented by Calendar.JULY (0-based index)

        // Add 30 days to the date
        calendar.add(Calendar.DAY_OF_MONTH, 30);

        // Get the updated date components
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Display the updated date
        System.out.println("Updated Date: " + month + "/" + day + "/" + year);

        // Subtract 2 weeks from the date
        calendar.add(Calendar.WEEK_OF_YEAR, -2);

        // Get the final date components
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);

        // Display the final date
        System.out.println("Final Date: " + month + "/" + day + "/" + year);
    }
}
