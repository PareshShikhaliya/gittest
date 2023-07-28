package Module1.class13;

public class MyClass {
    private static int total;
    private static int number1;
    private static int number2;


    static {
        // This is a static block
        System.out.println("Static block executed.");
        number1  =5;
        number2 = 10;
        total = number1+number2;
    }

    public static void main(String[] args) {
        System.out.println("Count: " + total);
    }
}
