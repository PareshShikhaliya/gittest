package class15;

import java.util.ArrayList;

public class VarAndDiamondOperatorExample {
    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.add("Hello");
        list.add(123);
        list.add(true);

        for (var element : list) {
            System.out.println(element.getClass().getSimpleName() + ": " + element);
        }
    }
}
