package class17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListComparisonExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            vector.add(i);
        }
        long endTime = System.nanoTime();
        long vectorAddTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;

        System.out.println("Addition Time:");
        System.out.println("Vector: " + vectorAddTime + " ns");
        System.out.println("ArrayList: " + arrayListAddTime + " ns");
        System.out.println("LinkedList: " + linkedListAddTime + " ns");

        // Random access
        startTime = System.nanoTime();
        int element1 = vector.get(500000);
        endTime = System.nanoTime();
        long vectorGetTime = endTime - startTime;

        startTime = System.nanoTime();
        int element2 = arrayList.get(500000);
        endTime = System.nanoTime();
        long arrayListGetTime = endTime - startTime;

        startTime = System.nanoTime();
        int element3 = linkedList.get(500000);
        endTime = System.nanoTime();
        long linkedListGetTime = endTime - startTime;

        System.out.println("\nRandom Access Time (get):");
        System.out.println("Vector: " + vectorGetTime + " ns");
        System.out.println("ArrayList: " + arrayListGetTime + " ns");
        System.out.println("LinkedList: " + linkedListGetTime + " ns");

        // Deletion
        startTime = System.nanoTime();
        vector.remove(500000);
        endTime = System.nanoTime();
        long vectorRemoveTime = endTime - startTime;

        startTime = System.nanoTime();
        arrayList.remove(500000);
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.remove(500000);
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;

        System.out.println("\nDeletion Time (remove):");
        System.out.println("Vector: " + vectorRemoveTime + " ns");
        System.out.println("ArrayList: " + arrayListRemoveTime + " ns");
        System.out.println("LinkedList: " + linkedListRemoveTime + " ns");
    }
}
