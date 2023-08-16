package Module1.class15;

public class WrapperClassExample1 {
    public static void main(String[] args) {
        // Using wrapper classes to convert primitive types into objects
        Integer myInt = Integer.valueOf(42);
        Double myDouble = Double.valueOf(3.14);
        Boolean myBoolean = Boolean.valueOf(true);

        // Accessing values and using utility methods
        int intVal = myInt.intValue();
        double doubleVal = myDouble.doubleValue();
        boolean booleanVal = myBoolean.booleanValue();

        System.out.println("Integer value: " + intVal);
        System.out.println("Double value: " + doubleVal);
        System.out.println("Boolean value: " + booleanVal);

        // Performing operations using wrapper classes
        Integer sum = myInt + 10;
        Double product = myDouble * 2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Converting strings to wrapper class objects
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("3.14");

        System.out.println("Parsed Integer: " + parsedInt);
        System.out.println("Parsed Double: " + parsedDouble);
    }
}
