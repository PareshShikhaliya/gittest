package Module1.class15;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // 1. Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i <fruits.size(); i++) {
            String fruit = fruits.get(i);
            //System.out.println(fruit);
        }

        //System.out.println();

        // 2. Using enhanced for loop (for-each loop)
        System.out.println("Using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        // 3. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        System.out.println();

        // 4. Using forEach method (Java 8+)
        System.out.println("Using forEach method:");
        fruits.forEach(System.out::println);
    }
}
