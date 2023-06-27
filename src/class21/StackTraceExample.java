package class21;

public class StackTraceExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        int numerator = 10;
        int denominator = 0;
        int result = numerator / denominator;
    }
}
