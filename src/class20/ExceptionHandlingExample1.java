package class20;

import java.util.Scanner;

public class ExceptionHandlingExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Code that may throw an exception
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.exit(1);
        } finally {
            System.out.println("I am the final truth");
            scanner.close();
        }
    }
}
