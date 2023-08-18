package Module1.class16;

import java.util.HashSet;
import java.util.Set;

public class ExtendedSetMethodsExample4 {
    public static void main(String[] args) {
        // Creating a HashSet to store integers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Creating a second set for demonstration
        Set<Integer> moreNumbers = new HashSet<>();
        moreNumbers.add(20);
        moreNumbers.add(40);
        moreNumbers.add(50);

        // Displaying the sets
        System.out.println("Set 'numbers': " + numbers);
        System.out.println("Set 'moreNumbers': " + moreNumbers);

        // Union of two sets
        Set<Integer> union = new HashSet<>(numbers);
        union.addAll(moreNumbers);
        System.out.println("Union of sets: " + union);

        // Intersection of two sets
        Set<Integer> intersection = new HashSet<>(numbers);
        intersection.retainAll(moreNumbers);
        System.out.println("Intersection of sets: " + intersection);

        // Difference between two sets
        Set<Integer> difference = new HashSet<>(numbers);
        difference.removeAll(moreNumbers);
        System.out.println("Difference of sets: " + difference);

        // Checking if one set is a subset of another
        boolean isSubset = numbers.containsAll(moreNumbers);
        System.out.println("Is 'moreNumbers' a subset of 'numbers'? " + isSubset);
    }
}
