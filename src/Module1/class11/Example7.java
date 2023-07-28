package Module1.class11;


public class Example7 {
    public static void main(String[] args) {
        // Widening (implicit) type casting
        byte a = 10;
        int b = a;          // Widening: byte to int
        float c = b;        // Widening: int to float
        double d = c;       // Widening: float to double

        System.out.println("Widening Type Casting:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        // Narrowing (explicit) type casting
        double x = 3.14;
        float y = (float) x;    // Narrowing: double to float
        int z = (int) y;        // Narrowing: float to int
        byte w = (byte) z;      // Narrowing: int to byte

        System.out.println("\nNarrowing Type Casting:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);

        int Welen = 1000000000;
        Welen = Welen+(Welen*10/100);
        System.out.println("Welen==="+Welen);
    }
}
