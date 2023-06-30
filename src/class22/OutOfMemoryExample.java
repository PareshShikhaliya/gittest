package class22;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

        try {
            while (true) {
                System.out.println("system is on....");
                int[] array = new int[Integer.MAX_VALUE];
                list.add(array);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory!");
            System.out.println("Total arrays created: " + list.size());
        }
    }
}
