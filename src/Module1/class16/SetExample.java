package Module1.class16;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a set
        Set<String> fruits = new HashSet<>();

        // Add elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate element, will be ignored

        System.out.println("Set contains: " + fruits);

        // Check if an element is present in the set
        String searchElement = "Apple";
        if (fruits.contains(searchElement)) {
            System.out.println(searchElement + " is found in the set.");
        } else {
            System.out.println(searchElement + " is not found in the set.");
        }

        // Remove an element from the set
        String removeElement = "Orange";
        boolean removed = fruits.remove(removeElement);
        if (removed) {
            System.out.println(removeElement + " is removed from the set.");
        } else {
            System.out.println(removeElement + " is not found in the set.");
        }

        System.out.println("Updated set contains: " + fruits);
    }
}
