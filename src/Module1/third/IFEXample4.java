package Module1.third;

import java.util.Scanner;

public class IFEXample4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a new Scanner object to read input from the user.

        // Example 1: Single if statement
        System.out.print("Enter a number: "); // Prompt the user to enter a number.
        int num1 = input.nextInt(); // Read an integer value from the user and store it in the variable "num1".

        if (num1 > 0) { // If the number is positive, print a message to the console.
            System.out.println(num1 + " is a positive number.");
        }

        // Example 2: If-else statement
        System.out.print("Enter another number: "); // Prompt the user to enter another number.
        int num2 = input.nextInt(); // Read an integer value from the user and store it in the variable "num2".



        if (num2 % 2 == 0) { // If the number is even, print a message to the console.
            System.out.println(num2 + " is an even number.");
        } else { // If the number is odd, print a different message to the console.
            System.out.println(num2 + " is an odd number.");
        }

        // Example 3: If-else if-else statement
        System.out.print("Enter a Module1.third number: "); // Prompt the user to enter a Module1.third number.
        int num3 = input.nextInt(); // Read an integer value from the user and store it in the variable "num3".

        if (num3 < 0) { // If the number is negative, print a message to the console.
            System.out.println(num3 + " is a negative number.");
        } else if (num3 == 0) { // If the number is zero, print a different message to the console.
            System.out.println(num3 + " is zero.");
        } else { // If the number is positive, print a Module1.third message to the console.
            System.out.println(num3 + " is a positive number.");
        }

        // Example 4: Nested if statements
        System.out.print("Enter a fourth number: "); // Prompt the user to enter a fourth number.
        int num4 = input.nextInt(); // Read an integer value from the user and store it in the variable "num4".

        if (num4 > 0) { // If the number is positive, print a message to the console and check if it is even or odd.
            System.out.println(num4 + " is a positive number.");
            if (num4 % 2 == 0) { // If the number is even, print a message to the console.
                System.out.println(num4 + " is an even number.");
            } else { // If the number is odd, print a different message to the console.
                System.out.println(num4 + " is an odd number.");
            }
        } else { // If the number is not positive, print a different message to the console.
            System.out.println(num4 + " is not a positive number.");
        }
    }
}
