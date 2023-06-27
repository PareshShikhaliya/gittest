package class20;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDemo {
    public static void main(String[] args) {
        // Test positive cases
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Shoes", 50.0);
        cart.addItem("Hat", 20.0);
        cart.addItem("T-Shirt", 15.0);

        System.out.println("Before removing item:");
        System.out.println("Total cost: $" + cart.getTotalCost());

        try {
            cart.removeItem("Shoes", 50.0);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("After removing item:");
        System.out.println("Total cost: $" + cart.getTotalCost());

        // Test negative cases
        ShoppingCart emptyCart = new ShoppingCart();

        try {
            emptyCart.removeItem("Shoes", 50.0);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            cart.removeItem("Pants", 30.0);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ShoppingCart {
    private List<String> items = new ArrayList<>();
    private double totalCost = 0.0;

    public void addItem(String item, double cost) {
        items.add(item);
        totalCost += cost;
    }

    public void removeItem(String item, double cost) throws ItemNotFoundException {
        if (!items.contains(item)) {
            throw new ItemNotFoundException("Item " + item + " not found in shopping cart.");
        }

        items.remove(item);
        totalCost -= cost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}

class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}
