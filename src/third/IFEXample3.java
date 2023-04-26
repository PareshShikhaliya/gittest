package third;

import java.util.Scanner;


public class IFEXample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a new Scanner object to read input from the user.

        System.out.print("Enter your score (out of 100): "); // Prompt the user to enter their numerical score.
        int score = input.nextInt(); // Read an integer value from the user and store it in the variable "score".

        char grade; // Declare a char variable to store the letter grade.

        if (score >= 90) { // If the score is greater than or equal to 90, set the grade to 'A'.
            grade = 'A';
        } else if (score >= 80) { // If the score is between 80 and 89, set the grade to 'B'.
            grade = 'B';
        } else if (score >= 70) { // If the score is between 70 and 79, set the grade to 'C'.
            grade = 'C';
        } else if (score >= 60) { // If the score is between 60 and 69, set the grade to 'D'.
            grade = 'D';
        } else { // If the score is less than 60, set the grade to 'F'.
            grade = 'F';
        }

        System.out.println("Your letter grade is: " + grade); // Print the student's letter grade to the console.
    }
}
