package class17.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        hashMap.put("Dave", 40);

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);

        // Accessing values using keys
        int age1 = hashMap.get("Alice");
        System.out.println("Age of Alice: " + age1);

        // Checking if a key exists
        boolean containsKey = hashMap.containsKey("Bob");
        System.out.println("Contains key 'Bob': " + containsKey);

        // Updating a value
        hashMap.put("Charlie", 36);
        System.out.println("Updated HashMap: " + hashMap);

        // Removing a key-value pair
        hashMap.remove("Dave");
        System.out.println("HashMap after removing 'Dave': " + hashMap);

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
