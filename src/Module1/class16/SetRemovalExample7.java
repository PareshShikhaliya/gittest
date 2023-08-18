package Module1.class16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetRemovalExample7 {
    public static void main(String[] args) {
        // Example Set of integers
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate for demonstration
        numbers.add(4);

        // Using a for-each loop to remove elements (NOT recommended)
        System.out.println("Original set: " + numbers);
        for (Integer num : numbers) {
            if (num == 2) {
                numbers.remove(num); // Causes ConcurrentModificationException
            }
        }

        // Explanation of the problem with for-each loop removal
        System.out.println("\nUsing for-each loop to remove elements:");
        System.out.println("This causes a ConcurrentModificationException.");
        System.out.println("Explanation: Modifying a collection while iterating with a for-each loop leads to inconsistencies.");

        // Using an explicit iterator to safely remove elements
        Set<String> colors = new HashSet<>();
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

        // Using a copy of the set to remove elements
        Set<Character> letters = new HashSet<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        Set<Character> copy = new HashSet<>(letters); // Create a copy
        for (char letter : copy) {
            if (letter == 'B') {
                letters.remove(Character.valueOf(letter)); // Safe removal with a copy
            }
        }
        System.out.println("\nAfter using copy: " + letters);
    }
}
