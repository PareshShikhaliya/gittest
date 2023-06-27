package class18;

import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return Double.compare(other.price, price) == 0 && Objects.equals(other.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void displayItems() {
        System.out.println("Shopping Cart Items:");
        for (Product item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }
}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("Enter an option:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display items");
            System.out.println("4. Quit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.println("Enter the name of the product:");
                    String productName = scanner.nextLine();
                    System.out.println("Enter the price of the product:");
                    double productPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    Product product = new Product(productName, productPrice);
                    cart.addItem(product);
                    System.out.println("Item added to the cart.");
                    break;
                case 2:
                    System.out.println("Enter the name of the product to remove:");
                    String productToRemove = scanner.nextLine();

                    boolean found = false;
                    for (Product item : cart.getItems()) {
                        if (item.getName().equalsIgnoreCase(productToRemove)) {
                            cart.removeItem(item);
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Item removed from the cart.");
                    } else {
                        System.out.println("Item not found in the cart.");
                    }
                    break;
                case 3:
                    cart.displayItems();
                    break;
                case 4:
                    System.out.println("Thank you for using the online shopping cart.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
