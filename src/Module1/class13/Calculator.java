package Module1.class13;

public class Calculator {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int result = Calculator.multiply(num1, num2);

        System.out.println("Result: " + result); // Output: Result: 15
    }
}
