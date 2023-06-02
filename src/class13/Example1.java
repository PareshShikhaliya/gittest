package class13;
 class Product {
    private static int totalProducts = 0;
    private String name;

     public static void countProduct() {
         totalProducts++;
     }

     public Product(String name) {

        this.name = name;
    }

    public static int getTotalProducts() {
         return totalProducts;
    }

    public String getName() {
        totalProducts++;
        return name;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Product p1 = new Product("Phone");
        Product.countProduct();
        Product p2 = new Product("Laptop");
        Product.countProduct();
        System.out.println(Product.getTotalProducts()); // Output: 2
        Product p3 = new Product("keyboard");
        Product.countProduct();


        System.out.println(Product.getTotalProducts()); // Output: 2
    }
}
