package Module1.class11;

public class Example4 {
    public static void main(String[] args) {
        char a1 = 'A';          // The variable 'a1' will contain the Latin letter 'A'.
        char a2 = 97;           // The variable 'a2' will contain the Latin letter 'A'. Its code is 65.
        char a3 = 0x41;         // The variable 'a3' will contain the Latin letter 'A'. Its code is 65, which equals 41 in the hexadecimal system.
        char a4 = 0x0041;       // The variable 'a4' will contain the Latin letter 'A'. Its code is 65, which equals 41 in the hexadecimal system.
        // The two extra zeros don't change anything.
        char a5 = '\u0041';     // The variable 'a5' will contain the Latin letter 'A'.
        // Another way to define a character by its code.

        System.out.println("a1: " + a1);  // Output: a1: A
        System.out.println("a2: " + a2);  // Output: a2: A
        System.out.println("a3: " + a3);  // Output: a3: A
        System.out.println("a4: " + a4);  // Output: a4: A
        System.out.println("a5: " + a5);  // Output: a5: A
    }
}
