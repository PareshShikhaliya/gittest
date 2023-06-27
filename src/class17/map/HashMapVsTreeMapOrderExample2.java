package class17.map;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class HashMapVsTreeMapOrderExample2 {
    public static void main(String[] args) {
        // Create a HashMap and a TreeMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to both maps
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Orange");

        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Orange");

        // Display the order of keys in HashMap
        System.out.println("Order of keys in HashMap: " + getOrderOfKeys(hashMap));

        // Display the order of keys in TreeMap
        System.out.println("Order of keys in TreeMap: " + getOrderOfKeys(treeMap));
    }

    // Helper method to get the order of keys in a map
    public static String getOrderOfKeys(Map<Integer, String> map) {
        StringBuilder order = new StringBuilder();
        for (Integer key : map.keySet()) {
            order.append(key).append(" ");
        }
        return order.toString().trim();
    }
}
