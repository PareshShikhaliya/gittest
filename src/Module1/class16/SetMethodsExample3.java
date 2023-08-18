package Module1.class16;

import java.util.HashSet;
import java.util.Set;

public class SetMethodsExample3 {
    public static void main(String[] args) {
        // Creating a HashSet to store strings
        Set<String> colors = new HashSet<>();

        // Adding elements to the set
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Displaying the set
        System.out.println("Set elements: " + colors);

        // Checking if the set is empty
        System.out.println("Is the set empty? " + colors.isEmpty());

        // Getting the size of the set
        System.out.println("Size of the set: " + colors.size());

        // Removing an element from the set
        String colorToRemove = "Green";
        colors.remove(colorToRemove);
        System.out.println("After removing " + colorToRemove + ": " + colors);

        // Checking if an element exists in the set
        String colorToCheck = "Red";
        if (colors.contains(colorToCheck)) {
            System.out.println(colorToCheck + " is in the set.");
        } else {
            System.out.println(colorToCheck + " is not in the set.");
        }

        // Clearing the entire set
        colors.clear();
        System.out.println("After clearing the set: " + colors);
    }
}
