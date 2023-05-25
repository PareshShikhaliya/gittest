package class11;

public class Example5 {
    public static void main(String[] args) {
        // Widening (implicit) type casting
        int x = 10;
        long y = Long.MAX_VALUE;      // Widening: int to long
        float z = y;     // Widening: long to float
        double w = z;    // Widening: float to double

        System.out.println("Widening Type Casting:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);

        // Narrowing (explicit) type casting
        double a = 3.14;
        float b = (float) a;    // Narrowing: double to float
        long c = (long) b;      // Narrowing: float to long
        int d = (int) c;        // Narrowing: long to int

        System.out.println("\nNarrowing Type Casting:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
