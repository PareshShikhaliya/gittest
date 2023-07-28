package Module1.class19;

import java.util.Scanner;

enum Coffee {
    ESPRESSO,
    AMERICANO,
    LATTE,
    CAPPUCCINO,
    MOCHA,
    INDIAANO
}

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Coffee Shop!");

        // Display menu
        System.out.println("Menu:");
        for (Coffee coffee : Coffee.values()) {
            System.out.println(coffee.ordinal() + 1 + ". " + coffee);
        }

        // Take user input
        System.out.print("Enter the number of your coffee choice: ");
        int choice = scanner.nextInt();

        // Validate and process order
        if (choice >= 1 && choice <= Coffee.values().length) {
            Coffee selectedCoffee = Coffee.values()[choice - 1];
            System.out.println("Preparing your " + selectedCoffee + ". Enjoy!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }
}

