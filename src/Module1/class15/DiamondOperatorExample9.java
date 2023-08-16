package Module1.class15;

import java.util.ArrayList;

public class DiamondOperatorExample9 {
    public static void main(String[] args) {
        // ArrayList with explicit type declaration
        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("John");
        names1.add("Jane");
        System.out.println("ArrayList with explicit type declaration: " + names1);

        // ArrayList with diamond operator <>
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Mike");
        names2.add("Emily");
        System.out.println("ArrayList with diamond operator <>: " + names2);
    }
}
