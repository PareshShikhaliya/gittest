package Module1.class26;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat6 {
    public static void main(String[] args) {
        Date currentDate = new Date();

        DateFormat usFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        String usFormattedDate = usFormat.format(currentDate);
        System.out.println("US Format: " + usFormattedDate);
    }
}
