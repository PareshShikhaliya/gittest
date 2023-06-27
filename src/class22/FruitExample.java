package class22;

public class FruitExample {
    public static Object getFruitInfo(String fruit) {
        return switch (fruit) {
            case "Apple", "Pear" -> {
                String color = "Green";
                int quantity = 10;
                yield "Color: " + color + ", Quantity: " + quantity;
            }
            case "Orange", "Mango" -> {
                String color = "Orange";
                double weight = 0.5;
                yield "Color: " + color + ", Weight: " + weight + "kg";
            }
            case "Banana" -> {
                String color = "Yellow";
                yield "Color: " + color;
            }
            default -> "Unknown fruit";
        };
    }

    public static void main(String[] args) {
        System.out.println(getFruitInfo("Apple")); // Output: Color: Green, Quantity: 10
        System.out.println(getFruitInfo("Pear")); // Output: Color: Green, Quantity: 10
        System.out.println(getFruitInfo("Orange")); // Output: Color: Orange, Weight: 0.5kg
        System.out.println(getFruitInfo("Banana")); // Output: Color: Yellow
        System.out.println(getFruitInfo("Grapes")); // Output: Unknown fruit
    }
}
