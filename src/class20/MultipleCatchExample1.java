package class20;


import java.util.Scanner;

public class MultipleCatchExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter another number: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Error: Division by zero");
        }
         catch (java.util.InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Error: Invalid input");
        }
    }
}
