package twentysix;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Example2 {
    public static void main(String[] args) {
        // Get the current date and time
        Date currentDate = new Date();
        System.out.println(currentDate);

        // Create a SimpleDateFormat instance with the desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");

        // Format the current date and time using the SimpleDateFormat instance
        String formattedDate = dateFormat.format(currentDate);

        // Print the formatted date and time
        System.out.println(formattedDate);
    }
}
