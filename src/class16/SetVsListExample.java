package class16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetVsListExample {
    public static void main(String[] args) {
        // Creating a Set
        Set<String> set = new HashSet<>();

        // Adding elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("apple"); // Duplicate element, will be ignored

        // Creating a List
        List<String> list = new ArrayList<>();

        // Adding elements to the List
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple"); // Duplicate element, will be added

        // Printing the Set
        System.out.println("Set contains: " + set);

        // Printing the List
        System.out.println("List contains: " + list);

        // Accessing elements by index in List
        String firstElement = list.get(0);
        System.out.println("First element in the list: " + firstElement);

        // Checking if an element is present in Set
        String searchElement = "Banana";
        if (set.contains(searchElement)) {
            System.out.println(searchElement + " is found in the set.");
        } else {
            System.out.println(searchElement + " is not found in the set.");
        }

        // Removing an element from List
        String removeElement = "Orange";
        boolean removed = list.remove(removeElement);
        if (removed) {
            System.out.println(removeElement + " is removed from the list.");
        } else {
            System.out.println(removeElement + " is not found in the list.");
        }

        // Printing the updated Set
        System.out.println("Updated set contains: " + set);

        // Printing the updated List
        System.out.println("Updated list contains: " + list);
    }
}
