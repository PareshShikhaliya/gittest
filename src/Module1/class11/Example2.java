package Module1.class11;

public class Example2 {
    public static void main(String[] args) {
        double nanValue = Double.NaN;
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;

        System.out.println("NaN Value: " + nanValue);
        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);

        // NaN operations
        System.out.println("NaN Operations:");
        System.out.println("  NaN + 5 = " + (nanValue + 5));
        System.out.println("  NaN - 10 = " + (nanValue - 10));
        System.out.println("  NaN * 2 = " + (nanValue * 2));
        System.out.println("  NaN / 3 = " + (nanValue / 3));

        // Infinity operations
        System.out.println("Infinity Operations:");
        System.out.println("  Infinity + 10 = " + (positiveInfinity + 10));
        System.out.println("  Infinity - 5 = " + (positiveInfinity - 5));
        System.out.println("  Infinity * 2 = " + (positiveInfinity * 2));
        System.out.println("  Infinity / 3 = " + (positiveInfinity / 3));
    }
}
