package Module1.class13;

public class MyClass2 {
    private static int count;

    static {
        // First static block
        System.out.println("First static block executed.");
        count = 10;
    }

    static {
        // Second static block
        System.out.println("Second static block executed.");
        count += 5;
    }

    public static void main(String[] args) {
        System.out.println("Count: " + count);
    }
}
