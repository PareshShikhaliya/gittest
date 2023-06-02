package class15;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // List of integers
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        System.out.println("List of integers: " + integerList);

        // List of strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        System.out.println("List of strings: " + stringList);

        // List of real numbers
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(1.618);
        doubleList.add(2.718);
        System.out.println("List of real numbers: " + doubleList);
    }
}
