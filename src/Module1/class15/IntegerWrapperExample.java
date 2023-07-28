package Module1.class15;

public class IntegerWrapperExample {
    public static void main(String[] args) {
        // Parsing a string to an int using parseInt()
        String numberStr = "42";
        int parsedNumber = Integer.parseInt(numberStr);
        System.out.println("Parsed number: " + parsedNumber);

        // Converting int to String using toString()
        int value = 123;
        String stringValue = Integer.toString(value);
        System.out.println("String value: " + stringValue);

        // Converting int to Integer using valueOf()
        int intValue = 100;
        Integer integerValue = Integer.valueOf(intValue);
        System.out.println("Integer value: " + integerValue);
    }
}
