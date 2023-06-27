package class20;

import java.util.Scanner;

public class FinallyExample3 {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Enter the dividend: ");
            int dividend = sc.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();

            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("In finally block of try-catch.");
            if (sc != null) {
                sc.close();
            }
        }

        try {
            System.out.println("In try block of try-finally.");
            int[] arr = new int[3];
            arr[3] = 10;
        } finally {
            System.out.println("In finally block of try-finally.");
        }

        try {
            System.out.println("In try block of try-catch-finally.");
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
