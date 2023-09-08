package module2.class15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductSorting9 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 899.99));
        products.add(new Product("Phone", 599.99));
        products.add(new Product("Tablet", 299.99));

        // Sorting by price without an anonymous inner class
        Collections.sort(products, new PriceComparator());

        // Printing sorted products
        System.out.println("Sorting without Anonymous Inner Class:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Sorting by price using an anonymous inner class as a Comparator
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return Double.compare(product1.getPrice(), product2.getPrice());
            }
        });

        // Printing sorted products
        System.out.println("\nSorting with Anonymous Inner Class:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

// Named Comparator class for sorting by price
class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return Double.compare(product1.getPrice(), product2.getPrice());
    }
}

