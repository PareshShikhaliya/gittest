package module2.class7;

import java.util.HashMap;
import java.util.Map;

class Product implements Cloneable {
    private String modelName;
    private Map<String, String> specifications;

    public Product(String modelName) {
        this.modelName = modelName;
        this.specifications = new HashMap<>();
    }

    public void addSpecification(String key, String value) {
        specifications.put(key, value);
    }

    // Deep copy of Product
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Product clonedProduct = (Product) super.clone();
        clonedProduct.specifications = new HashMap<>(specifications);
        return clonedProduct;
    }

    public String getModelName() {
        return modelName;
    }

    public Map<String, String> getSpecifications() {
        return new HashMap<>(specifications);
    }
}

public class LaptopConfigurationExample4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product baseConfiguration = new Product("Standard Laptop");
        baseConfiguration.addSpecification("Processor", "Intel Core i5");
        baseConfiguration.addSpecification("RAM", "8 GB");
        baseConfiguration.addSpecification("Storage", "256 GB SSD");

        // Clone the base configuration for different customization
        Product customConfiguration1 = (Product) baseConfiguration.clone();
        customConfiguration1.addSpecification("RAM", "16 GB");

        Product customConfiguration2 = (Product) baseConfiguration.clone();
        customConfiguration2.addSpecification("Processor", "Intel Core i7");
        customConfiguration2.addSpecification("Storage", "512 GB SSD");

        // Print the details of each configuration
        printConfigurationDetails(baseConfiguration);
        printConfigurationDetails(customConfiguration1);
        printConfigurationDetails(customConfiguration2);
    }

    private static void printConfigurationDetails(Product product) {
        System.out.println("Model: " + product.getModelName());
        System.out.println("Specifications: " + product.getSpecifications());
        System.out.println();
    }
}
