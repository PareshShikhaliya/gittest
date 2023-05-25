package ninth;

import java.util.Scanner;

public class GroceryStore {

    // Constants for item prices
    public static final double APPLE_PRICE = 0.50;
    public static final double BANANA_PRICE = 0.25;
    public static final double ORANGE_PRICE = 0.75;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        int[] itemCounts = new int[3];

        boolean shopping = true;
        while (shopping) {
            // Prompt user for item choice
            System.out.println("What would you like to buy?");
            System.out.println("1. Apple ($" + APPLE_PRICE + ")");
            System.out.println("2. Banana ($" + BANANA_PRICE + ")");
            System.out.println("3. Orange ($" + ORANGE_PRICE + ")");
            System.out.println("4. Checkout");
            int choice = scanner.nextInt();

            if (choice == 1) {
                itemCounts[0]++;
                total += APPLE_PRICE;
                System.out.println("Added 1 apple to your cart");
            } else if (choice == 2) {
                itemCounts[1]++;
                total += BANANA_PRICE;
                System.out.println("Added 1 banana to your cart");
            } else if (choice == 3) {
                itemCounts[2]++;
                total += ORANGE_PRICE;
                System.out.println("Added 1 orange to your cart");
            } else if (choice == 4) {
                shopping = false;
            } else {
                System.out.println("Invalid choice");
            }
        }

        // Print receipt
        printReceipt(itemCounts, total);
    }

    public static void printReceipt(int[] itemCounts, double total) {
        System.out.println("Thank you for shopping with us!");
        System.out.println("Here is your receipt:");
        System.out.println("Item\tQuantity\tPrice");
        System.out.printf("Apples\t%d\t\t$%.2f%n", itemCounts[0], itemCounts[0] * APPLE_PRICE);
        System.out.printf("Bananas\t%d\t\t$%.2f%n", itemCounts[1], itemCounts[1] * BANANA_PRICE);
        System.out.printf("Oranges\t%d\t\t$%.2f%n", itemCounts[2], itemCounts[2] * ORANGE_PRICE);
        System.out.printf("Total\t\t\t$%.2f", total);
    }

}

