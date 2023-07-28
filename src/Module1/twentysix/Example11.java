package Module1.twentysix;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example11 {
    public static void main(String[] args) {
        // Create a date string in the format "yyyy-MM-dd"
        String dateString = "2023-04-22";

        // Parse the date string into a LocalDate object
        LocalDate date = LocalDate.parse(dateString);

        // Print the LocalDate object
        System.out.println(dateString.getClass());
        System.out.println(date.getClass());

        // Format the LocalDate object using a custom format string
        String formattedDate = date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
        System.out.println(formattedDate);
    }
}
