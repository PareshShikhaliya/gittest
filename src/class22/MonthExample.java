package class22;

import java.time.Month;

public class MonthExample {
    public static int daysInMonth(Month month) {
        int result = switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> 28;
            default -> 0;
        };
        return result;
    }

    public static void main(String[] args) {
        Month january = Month.JANUARY;
        Month february = Month.FEBRUARY;
        Month april = Month.APRIL;

        System.out.println(january + " has " + daysInMonth(january) + " days");
        System.out.println(february + " has " + daysInMonth(february) + " days");
        System.out.println(april + " has " + daysInMonth(april) + " days");
    }
}
