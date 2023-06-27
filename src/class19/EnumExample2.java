package class19;

enum Weekday {
    MONDAY("Mon", 1),
    TUESDAY("Tue", 2),
    WEDNESDAY("Wed", 3),
    THURSDAY("Thu", 4),
    FRIDAY("Fri", 5),
    SATURDAY("Sat", 6),
    SUNDAY("Sun", 7);

    private final String abbreviation;
    private final int order;

    Weekday(String abbreviation, int order) {
        this.abbreviation = abbreviation;
        this.order = order;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getOrder() {
        return order;
    }

    public Weekday next() {
        int nextIndex = (this.ordinal() + 1) % Weekday.values().length;
        return Weekday.values()[nextIndex];
    }

    public Weekday previous() {
        int previousIndex = (this.ordinal() - 1 + Weekday.values().length) % Weekday.values().length;
        return Weekday.values()[previousIndex];
    }
}

public class EnumExample2 {
    public static void main(String[] args) {
        Weekday today = Weekday.MONDAY;

        // Using enum methods
        System.out.println("Today: " + today);
        System.out.println("Abbreviation: " + today.getAbbreviation());
        System.out.println("Order: " + today.getOrder());


        Weekday nextDay = today.next();
        System.out.println("Next day: " + nextDay);

        Weekday previousDay = today.previous();
        System.out.println("Previous day: " + previousDay);
    }
}
