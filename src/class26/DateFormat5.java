package class26;

import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Locale;

public class DateFormat5 {
    public static void main(String[] args) {
        Date currentDate = new Date();

        System.out.println("currentDate==="+currentDate);

        DateFormat indianFormat = new SimpleDateFormat("dd-MM-yyyy", new Locale("en", "IN"));
        String indianFormattedDate = indianFormat.format(currentDate);
        System.out.println("Indian Format: " + indianFormattedDate);
    }
}
