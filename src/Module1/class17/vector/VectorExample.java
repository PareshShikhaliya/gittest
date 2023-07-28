package Module1.class17.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements to the vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        System.out.println("Vector: " + vector);

        // Accessing elements in the vector
        String firstElement = vector.get(0);
        System.out.println("First element: " + firstElement);

        // Updating an element in the vector
        vector.set(1, "Grapes");
        System.out.println("Vector after update: " + vector);

        // Removing an element from the vector
        String removedElement = vector.remove(2);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Vector after removal: " + vector);

        // Checking if the vector contains an element
        boolean containsBanana = vector.contains("Banana");
        System.out.println("Contains 'Banana'? " + containsBanana);

        // Getting the size of the vector
        int size = vector.size();
        System.out.println("Size of the vector: " + size);
    }
}
