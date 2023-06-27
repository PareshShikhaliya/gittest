package class17.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a new TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");
        treeMap.put(4, "Mango");

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing values using keys
        String fruit1 = treeMap.get(2);
        System.out.println("Fruit at key 2: " + fruit1);

        // Checking if a key exists
        boolean containsKey = treeMap.containsKey(3);
        System.out.println("Contains key 3: " + containsKey);

        // Updating a value
        treeMap.put(3, "Grapes");
        System.out.println("Updated TreeMap: " + treeMap);

        // Removing a key-value pair
        treeMap.remove(4);
        System.out.println("TreeMap after removing key 4: " + treeMap);

        // Iterating over the TreeMap
        System.out.println("Iterating over the TreeMap:");
        for (Integer key : treeMap.keySet()) {
            String value = treeMap.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
