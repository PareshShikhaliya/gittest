package Module1.class20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Code that may throw an exception


        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("Number entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        }
    }
}
