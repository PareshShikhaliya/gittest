package Module1.class17;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample1 {
    public static void main(String[] args) {
        // Create a collection
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // Demonstrating Collections.min()
        int minNumber = Collections.min(numbers);
        System.out.println("Minimum number: " + minNumber);

        // Demonstrating Collections.max()
        int maxNumber = Collections.max(numbers);
        System.out.println("Maximum number: " + maxNumber);

        // Demonstrating Collections.frequency()
        int frequency = Collections.frequency(numbers, 2);
        System.out.println("Frequency of number 2: " + frequency);

        // Demonstrating Collections.binarySearch()
        Collections.sort(numbers); // Binary search requires a sorted collection
        int searchIndex = Collections.binarySearch(numbers, 7);
        if (searchIndex >= 0) {
            System.out.println("Number 7 found at index: " + searchIndex);
        } else {
            System.out.println("Number 7 not found.");
        }

        // Demonstrating Collections.disjoint()
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(8);
        numbers2.add(6);

        boolean isDisjoint = Collections.disjoint(numbers, numbers2);
        System.out.println("Are the collections disjoint? " + isDisjoint);
    }
}
