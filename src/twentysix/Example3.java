package twentysix;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Example3 {
    public static void main(String[] args) {
        // Get the current date and time
        Date currentDate = new Date();

        // Create a SimpleDateFormat instance with the desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time using the SimpleDateFormat instance
        String formattedDate = dateFormat.format(currentDate);

        // Print the formatted date and time
        System.out.println(formattedDate);
    }
}
