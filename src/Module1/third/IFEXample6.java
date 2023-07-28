package Module1.third;

import java.util.Scanner;


public class IFEXample6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num == 0) {
            System.out.println("You entered zero.");
        } else if (num > 0) {
            System.out.println("You entered a positive number.");
        } else {
            System.out.println("You entered a negative number.");
        }

        System.out.print("Enter a string: ");
        String str1 = input.next();
        System.out.print("Enter another string: ");
        String str2 = input.next();

        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }
}
