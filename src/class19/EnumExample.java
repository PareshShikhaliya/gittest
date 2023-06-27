package class19;

public class EnumExample {
    public static void main(String[] args) {
        // Using the enum values
        Color c1 = Color.RED;
        Color c2 = Color.GREEN;
        Color c3 = Color.BLUE;

        // Accessing the enum values
        System.out.println(c1);  // Output: RED
        System.out.println(c2);  // Output: GREEN
        System.out.println(c3);  // Output: BLUE


        // Comparing enum values
        if (c1 == Color.RED) {
            System.out.println("c1 is RED");  // Output: c1 is RED
        }

    }
}
 enum Color {
    RED,
    GREEN,
    BLUE
}
