package Module1.class16;

import java.util.HashSet;

public class HashSetResizingExample3 {
    public static void main(String[] args) {
        int initialCapacity = 5;
        float loadFactor = 0.6f; // Lower load factor for demonstration
        HashSet<Integer> hashSet = new HashSet<>(initialCapacity, loadFactor);

        // Add elements to the HashSet
        for (int i = 1; i <= 10; i++) {
            hashSet.add(i);
            System.out.println("Added: " + i + ", Load Factor: " + getLoadFactor(hashSet));
        }

        System.out.println("HashSet elements: " + hashSet);
    }

    private static float getLoadFactor(HashSet<?> set) {
        return (float) set.size() / set.toArray().length;
    }
}
