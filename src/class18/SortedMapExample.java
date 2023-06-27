package class18;
import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        // Create a sorted map
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // Add key-value pairs to the sorted map
        sortedMap.put(3, "Value 3");
        sortedMap.put(1, "Value 1");
        sortedMap.put(2, "Value 2");
        sortedMap.put(5, "Value 5");
        sortedMap.put(4, "Value 4");

        // Print the sorted map
        System.out.println("Sorted Map: " + sortedMap);

        // Access values in sorted order
        System.out.println("Values in Sorted Order:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Get the first key-value pair (smallest key)
        Integer firstKey = sortedMap.firstKey();
        String firstValue = sortedMap.get(firstKey);
        System.out.println("First Entry: Key=" + firstKey + ", Value=" + firstValue);

        // Get the last key-value pair (largest key)
        Integer lastKey = sortedMap.lastKey();
        String lastValue = sortedMap.get(lastKey);
        System.out.println("Last Entry: Key=" + lastKey + ", Value=" + lastValue);

        // Remove a key-value pair from the sorted map
        sortedMap.remove(3);
        System.out.println("Sorted Map after removing key 3: " + sortedMap);
    }
}
