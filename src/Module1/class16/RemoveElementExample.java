package Module1.class16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("List before removal: " + list);

        // Using Iterator to remove an element
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                iterator.remove();
            }
        }

        System.out.println("List after removal: " + list);
    }
}
