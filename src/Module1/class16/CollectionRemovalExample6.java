package Module1.class16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionRemovalExample6 {
    public static void main(String[] args) {
        // Example List of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate for demonstration
        numbers.add(4);

        // Using a for-each loop to remove elements (NOT recommended)
        System.out.println("Original list: " + numbers);
        for (Integer num : numbers) {
            if (num == 2) {
                numbers.remove(num); // Causes ConcurrentModificationException
            }
        }

        // Explanation of the problem with for-each loop removal
        System.out.println("\nUsing for-each loop to remove elements:");
        System.out.println("This causes a ConcurrentModificationException.");
        System.out.println("Explanation: Modifying a collection while iterating with a for-each loop leads to inconsistencies.");

        // Using a different kind of loop (index-based) to remove elements
        List<Integer> numbersWithForLoop = new ArrayList<>(numbers); // Copy the list
        System.out.println("\nOriginal list: " + numbersWithForLoop);
        for (int i = 0; i < numbersWithForLoop.size(); i++) {
            if (numbersWithForLoop.get(i) == 2) {
                numbersWithForLoop.remove(i);
                i--; // Adjust index due to removal
            }
        }
        System.out.println("After using for loop: " + numbersWithForLoop);

        // Using an explicit iterator to safely remove elements
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Green")) {
                iterator.remove(); // Safely remove with iterator
            }
        }
        System.out.println("\nAfter using iterator: " + colors);

        // Using a copy of the collection to remove elements
        List<Character> letters = new ArrayList<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        List<Character> copy = new ArrayList<>(letters); // Create a copy
        for (char letter : copy) {
            if (letter == 'B') {
                letters.remove(Character.valueOf(letter)); // Safe removal with a copy
            }
        }
        System.out.println("\nAfter using copy: " + letters);
    }
}
