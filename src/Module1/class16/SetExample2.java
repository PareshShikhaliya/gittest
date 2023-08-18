package Module1.class16;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        // Creating a HashSet to store unique integers
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Adding elements to the set
        uniqueNumbers.add(5);
        uniqueNumbers.add(10);
        uniqueNumbers.add(15);
        uniqueNumbers.add(20);

        // Adding a duplicate element (won't be added)
        uniqueNumbers.add(10);

        // Displaying the set
        System.out.println("Set elements: " + uniqueNumbers);

        // Checking if an element exists in the set
        int numberToCheck = 15;
        if (uniqueNumbers.contains(numberToCheck)) {
            System.out.println(numberToCheck + " is in the set.");
        } else {
            System.out.println(numberToCheck + " is not in the set.");
        }

        // Removing an element from the set
        int numberToRemove = 5;
        uniqueNumbers.remove(numberToRemove);
        System.out.println("After removing " + numberToRemove + ": " + uniqueNumbers);
    }
}
