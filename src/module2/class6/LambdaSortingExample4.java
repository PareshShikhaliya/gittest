package module2.class6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSortingExample4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        // 1
        Comparator<String> comparator1 = (String obj1, String obj2) -> {
            return obj1.length() - obj2.length();
        };
        Collections.sort(list, comparator1);
        System.out.println("Sorted using comparator1: " + list);

        // 2
        Collections.sort(list, (String obj1, String obj2) -> obj1.length() - obj2.length());
        System.out.println("Sorted using lambda expression (2): " + list);

        // 3
        Comparator<String> comparator3 = (obj1, obj2) -> obj1.length() - obj2.length();
        Collections.sort(list, comparator3);
        System.out.println("Sorted using comparator3: " + list);

        // 4
        Collections.sort(list, (obj1, obj2) -> obj1.length() - obj2.length());
        System.out.println("Sorted using lambda expression (4): " + list);
    }
}
