package class17.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableVsHashMapPerformanceExample {
    private static final int NUM_ITERATIONS = 1000000;

    public static void main(String[] args) {
        // Performance comparison between Hashtable and HashMap

        // Test Hashtable
        long startTimeHashtable = System.nanoTime();
        Map<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            hashtable.put(i, i);
        }
        long endTimeHashtable = System.nanoTime();

        // Test HashMap
        long startTimeHashMap = System.nanoTime();
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < NUM_ITERATIONS; i++) {
            hashMap.put(i, i);
        }
        long endTimeHashMap = System.nanoTime();

        // Calculate and display the elapsed time
        long elapsedTimeHashtable = endTimeHashtable - startTimeHashtable;
        long elapsedTimeHashMap = endTimeHashMap - startTimeHashMap;

        System.out.println("Elapsed Time for Hashtable (ms): " + (elapsedTimeHashtable / 1000000));
        System.out.println("Elapsed Time for HashMap (ms): " + (elapsedTimeHashMap / 1000000));
    }
}
