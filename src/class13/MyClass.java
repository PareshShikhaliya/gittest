package class13;

public class MyClass {
    private static int count;

    static {
        // This is a static block
        System.out.println("Static block executed.");
        count = 10;
    }

    public static void main(String[] args) {
        System.out.println("Count: " + count);
    }
}
