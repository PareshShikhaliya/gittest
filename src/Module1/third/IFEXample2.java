package Module1.third;

import java.util.Scanner;


public class IFEXample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a new Scanner object to read input from the user.

        System.out.print("Is it sunny outside? (true/false): "); // Ask the user if it's sunny outside.
        boolean isSunny = input.nextBoolean(); // Read a boolean value from the user and store it in the variable "isSunny".

        if (isSunny) { // Check if it's sunny outside.
            System.out.print("Is the water warm? (true/false): "); // Ask the user if the water is warm.
            boolean isWaterWarm = input.nextBoolean(); // Read a boolean value from the user and store it in the variable "isWaterWarm".

            if (isWaterWarm) { // Check if the water is warm.
                System.out.println("Let's go to the beach!"); // If it's sunny and the water is warm, print a message indicating to go to the beach.
            } else {
                System.out.println("Sorry, it's not warm enough to go to the beach."); // If it's sunny but the water is not warm, print a message indicating not to go to the beach.
            }
        } else {
            System.out.println("It's not sunny outside. Let's do something else."); // If it's not sunny outside, print a message indicating not to go to the beach.
        }
    }
}


