package class15;

import java.util.ArrayList;

public class TypeInferenceExample {
    public static void main(String[] args) {
        // ArrayList with explicit type declaration
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(2);
        System.out.println("ArrayList with explicit type declaration: " + numbers1);

        // ArrayList with type inference using var
        var numbers2 = new ArrayList<Integer>();
        numbers2.add(3);
        numbers2.add(4);
        System.out.println("ArrayList with type inference using var: " + numbers2);
    }
}
