package Module1.twentysix.proj1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        // Create new appointments
        Appointment appointment1 = new Appointment("Meeting with client",new Date(124, 03, 22, 12, 0, 0),new Date(124, 03, 22, 14, 0, 0));
        Appointment appointment2 = new Appointment("Meeting with client2",new Date(124, 03, 22, 16, 0, 0),new Date(124, 03, 22, 18, 0, 0));



        // Print appointment details
        System.out.println(appointment1);
        System.out.println(appointment2);

        // Update appointment title
        appointment1.setTitle("Updated meeting with client");

        // Print updated appointment details
        System.out.println(appointment1);
    }
}

class Appointment {
    private String title;
    private Date startDate;
    private Date endDate;

    public Appointment(String title, Date startDate, Date endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return "Appointment \"" + title + "\" from " + dateFormat.format(startDate) + " to " + dateFormat.format(endDate);
    }
}
