package Module1.class11;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(0.0 / 0.0);  // Output: NaN

        double infinity = 1.0 / 0.0;

        System.out.println(infinity );  // Output: NaN

        System.out.println(infinity / infinity);  // Output: NaN

        double a = 0.0 / 0.0;
        double b = a * 10;
        double c = b - 100;
        double d = a + infinity;

        System.out.println("a == NaN: " + (a == Double.NaN));  // Output: a == NaN: false
        System.out.println("b == NaN: " + (b == Double.NaN));  // Output: b == NaN: false
        System.out.println("c == NaN: " + (c == Double.NaN));  // Output: c == NaN: false
        System.out.println("d == NaN: " + (d == Double.NaN));  // Output: d == NaN: false
    }
}
