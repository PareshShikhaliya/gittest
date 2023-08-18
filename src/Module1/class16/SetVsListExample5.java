package Module1.class16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetVsListExample5 {
    public static void main(String[] args) {
        // Creating a List and a Set
        List<String> myList = new ArrayList<>();
        Set<String> mySet = new HashSet<>();

        // Adding elements to both List and Set
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Apple"); // Duplicates allowed in List

        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");
        mySet.add("Apple"); // Duplicates not allowed in Set

        // Displaying List and Set contents
        System.out.println("List elements: " + myList);
        System.out.println("Set elements: " + mySet);

        // Accessing elements by index (only applicable to List)
        System.out.println("Element at index 1 in List: " + myList.get(1));

        // Checking if an element exists in List or Set
        System.out.println("Does List contain 'Banana'? " + myList.contains("Banana"));
        System.out.println("Does Set contain 'Banana'? " + mySet.contains("Banana"));

        // Removing an element from List and Set
        myList.remove("Orange");
        mySet.remove("Orange");

        // Displaying modified List and Set contents
        System.out.println("Modified List elements: " + myList);
        System.out.println("Modified Set elements: " + mySet);
    }
}
