package class22;

public class NumberExample {
    public static String getNumberName(int number) {
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            default -> "Unknown";
        };
    }

    public static void main(String[] args) {
        System.out.println(getNumberName(1)); // Output: One
        System.out.println(getNumberName(3)); // Output: Three
        System.out.println(getNumberName(6)); // Output: Unknown
    }
}
