package class17.map;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class HashMapVsTreeMapOrderExample {
    public static void main(String[] args) {
        // Create a HashMap and a TreeMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs to both maps
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 1);
        hashMap.put("Orange", 5);

        treeMap.put("Apple", 3);
        treeMap.put("Banana", 1);
        treeMap.put("Orange", 5);

        // Display the order of keys in HashMap
        System.out.println("Order of keys in HashMap: " + getOrderOfKeys(hashMap));

        // Display the order of keys in TreeMap
        System.out.println("Order of keys in TreeMap: " + getOrderOfKeys(treeMap));
    }

    // Helper method to get the order of keys in a map
    public static String getOrderOfKeys(Map<String, Integer> map) {
        StringBuilder order = new StringBuilder();
        for (String key : map.keySet()) {
            order.append(key).append(" ");
        }
        return order.toString().trim();
    }
}
