package class15;

public class AutoboxingUnboxingExample1 {
    public static void main(String[] args) {
        // Autoboxing - converting primitive to wrapper class
        int num = 10;
        Integer integerObj = num; // autoboxing int to Integer

        System.out.println("Autoboxing example:");
        System.out.println("num: " + num);
        System.out.println("integerObj: " + integerObj);

        // Unboxing - converting wrapper class to primitive
        Double doubleObj = 3.14;
        double doubleNum = doubleObj; // unboxing Double to double

        System.out.println("\nUnboxing example:");
        System.out.println("doubleObj: " + doubleObj);
        System.out.println("doubleNum: " + doubleNum);
    }
}
