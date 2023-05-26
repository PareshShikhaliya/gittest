package class13;
 class Product {
    private static int totalProducts = 0;
    private String name;

    public Product(String name) {
        this.name = name;
        totalProducts++; // Increment the total number of products
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public String getName() {
        return name;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Product p1 = new Product("Phone");
        Product p2 = new Product("Laptop");

        System.out.println(p1.getName()); // Output: Phone
        System.out.println(p2.getName()); // Output: Laptop

        System.out.println(Product.getTotalProducts()); // Output: 2
    }
}
