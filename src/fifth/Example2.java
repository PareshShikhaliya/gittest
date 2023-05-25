package fifth;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 20; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}
