package class15;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("List after adding elements: " + fruits);

        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // Adding an element at a specific index
        fruits.add(1, "Mango");
        System.out.println("List after adding Mango at index 1: " + fruits);

        // Getting an element at a specific index
        String fruit = fruits.get(2);
        System.out.println("Element at index 2: " + fruit);

        // Setting an element at a specific index
        fruits.set(0, "Grapes");
        System.out.println("List after setting Grapes at index 0: " + fruits);

        // Removing an element at a specific index
        String removedFruit = fruits.remove(1);
        System.out.println("Removed fruit at index 1: " + removedFruit);
        System.out.println("List after removing element: " + fruits);

        // Removing an element by value
        boolean isRemoved = fruits.remove("Orange");
        System.out.println("Is Orange removed? " + isRemoved);
        System.out.println("List after removing Orange: " + fruits);

        // Clearing the list
        fruits.clear();
        System.out.println("List after clearing: " + fruits);

        // Checking if the list contains a value
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does the list contain Banana? " + containsBanana);

        // Checking if the list is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Getting the size of the list
        size = fruits.size();
        System.out.println("Size of the list: " + size);

        // Converting the list to an array
        String[] fruitArray = new String[fruits.size()];
        fruitArray = fruits.toArray(fruitArray);
        System.out.print("Array representation of the list: ");
        for (String f : fruitArray) {
            System.out.print(f + " ");
        }
    }
}
