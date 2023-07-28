package Module1.class11;

public class Example6 {
    public static void main(String[] args) {
        // Widening (implicit) type casting
        int x = 657834343;
        char y = (char) x;      // Widening: int to char

        System.out.println("Widening Type Casting:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // Narrowing (explicit) type casting
        char a = 'A';
        int b = a;        // Narrowing: char to int

        System.out.println("\nNarrowing Type Casting:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
