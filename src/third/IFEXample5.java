package third;

import java.util.Scanner;


public class IFEXample5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("You entered a positive number.");
        } else if (num < 0) {
            System.out.println("You entered a negative number.");
        } else {
            System.out.println("You entered zero.");
        }

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18 && age <= 65) {
            System.out.println("You are eligible to vote and work.");
        } else if (age > 65) {
            System.out.println("You are retired.");
        } else {
            System.out.println("You are too young to work and vote.");
        }

        System.out.print("Enter a letter: ");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("You entered a vowel.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("You entered a consonant.");
        } else {
            System.out.println("You did not enter a letter.");
        }

        int x = 10, y = 5;
        boolean result1 = (x > y) && (y < x);
        boolean result2 = (x > y) || (y > x);

        if (result1) {
            System.out.println("x is greater than y and y is less than x.");
        } else {
            System.out.println("The expression (x > y) && (y < x) is false.");
        }

        if (result2) {
            System.out.println("Either x is greater than y or y is greater than x.");
        } else {
            System.out.println("The expression (x > y) || (y > x) is false.");
        }
    }
}
