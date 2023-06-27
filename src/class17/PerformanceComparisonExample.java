package class17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;

public class PerformanceComparisonExample {
    public static void main(String[] args) {
        int numElements = 1000000;

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;

        startTime = System.nanoTime();
        arrayList.remove(numElements / 2);
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.remove(numElements / 2);
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;

        // HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long hashSetAddTime = endTime - startTime;

        startTime = System.nanoTime();
        hashSet.remove(numElements / 2);
        endTime = System.nanoTime();
        long hashSetRemoveTime = endTime - startTime;

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        long treeSetAddTime = endTime - startTime;

        startTime = System.nanoTime();
        treeSet.remove(numElements / 2);
        endTime = System.nanoTime();
        long treeSetRemoveTime = endTime - startTime;

        // HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashMap.put(i, i);
        }
        endTime = System.nanoTime();
        long hashMapPutTime = endTime - startTime;

        startTime = System.nanoTime();
        hashMap.remove(numElements / 2);
        endTime = System.nanoTime();
        long hashMapRemoveTime = endTime - startTime;

        // TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            treeMap.put(i, i);
        }
        endTime = System.nanoTime();
        long treeMapPutTime = endTime - startTime;

        startTime = System.nanoTime();
        treeMap.remove(numElements / 2);
        endTime = System.nanoTime();
        long treeMapRemoveTime = endTime - startTime;

        // Print performance results
        System.out.println("Performance Comparison:");
        System.out.println("--------------------------------------------------");
        System.out.println("Data Structure   |   Add Time (ns)   |   Remove Time (ns)");
        System.out.println("--------------------------------------------------");
        System.out.println("ArrayList        |   " + arrayListAddTime + "            |   " + arrayListRemoveTime);
        System.out.println("LinkedList       |   " + linkedListAddTime + "            |   " + linkedListRemoveTime);
        System.out.println("HashSet          |   " + hashSetAddTime + "            |   " + hashSetRemoveTime);
        System.out.println("TreeSet          |   " + treeSetAddTime + "            |   " + treeSetRemoveTime);
        System.out.println("HashMap          |   " + hashMapPutTime + "            |   " + hashMapRemoveTime);
        System.out.println("TreeMap          |   " + treeMapPutTime + "            |   " + treeMapRemoveTime);
        System.out.println("--------------------------------------------------");
    }
}
