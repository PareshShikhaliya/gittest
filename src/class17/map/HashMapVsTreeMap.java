package class17.map;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class HashMapVsTreeMap {
    public static void main(String[] args) {
        // Create a HashMap and a TreeMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to both maps
        hashMap.put(3, "Apple");
        hashMap.put(100, "Banana");
        hashMap.put(2, "Orange");

        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);

        // Display the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Modify the HashMap
        hashMap.put(1, "Grapes");
        hashMap.remove(3);

        // Modify the TreeMap
        treeMap.put(1, "Grapes");
        treeMap.remove(3);

        // Display the modified HashMap
        System.out.println("Modified HashMap: " + hashMap);

        // Display the modified TreeMap
        System.out.println("Modified TreeMap: " + treeMap);

        // Iterating over the HashMap
        System.out.println("\nIterating over the HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Iterating over the TreeMap
        System.out.println("\nIterating over the TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
