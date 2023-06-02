package class15;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the end of the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList after adding elements: " + numbers);

        // Insert an element at the beginning of the list
        numbers.add(0, 5);
        System.out.println("ArrayList after inserting element at index 0: " + numbers);

        // Insert an element in the middle of the list
        numbers.add(2, 15);
        System.out.println("ArrayList after inserting element at index 2: " + numbers);

        // Remove an element from the list
        numbers.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + numbers);

        // Access elements in the list
        int element1 = numbers.get(0);
        int element2 = numbers.get(2);
        System.out.println("Element at index 0: " + element1);
        System.out.println("Element at index 2: " + element2);
    }
}
