package class17.map;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    public static void main(String[] args) {
        // Create a Map to store the inventory
        Map<String, Integer> inventory = new HashMap<>();

        // Add products and their quantities to the inventory
        inventory.put("ABC123", 10); // Product ID: ABC123, Quantity: 10
        inventory.put("DEF456", 5);  // Product ID: DEF456, Quantity: 5
        inventory.put("GHI789", 15); // Product ID: GHI789, Quantity: 15

        // Display the inventory
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String productId = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Product ID: " + productId + ", Quantity: " + quantity);
        }

        // Update the quantity of a product
        inventory.put("ABC123", 8); // Updating the quantity of product ABC123 to 8

        // Display the updated inventory
        System.out.println("\nUpdated Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String productId = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Product ID: " + productId + ", Quantity: " + quantity);
        }

        // Check if a product exists in the inventory
        String productId = "DEF456";
        if (inventory.containsKey(productId)) {
            int quantity = inventory.get(productId);
            System.out.println("\nProduct " + productId + " exists in the inventory with a quantity of " + quantity);
        } else {
            System.out.println("\nProduct " + productId + " does not exist in the inventory");
        }
    }
}
