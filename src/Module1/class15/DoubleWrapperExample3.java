package Module1.class15;

public class DoubleWrapperExample3 {
    public static void main(String[] args) {
        // Parsing a string to a double using parseDouble()
        String numberStr = "3.14";
        double parsedNumber = Double.parseDouble(numberStr);
        System.out.println("Parsed number: " + parsedNumber);

        // Converting double to String using toString()
        double value = 2.718;
        String stringValue = Double.toString(value);
        System.out.println("String value: " + stringValue);

        // Converting Double to double using doubleValue()
        Double doubleValue = Double.valueOf(3.1415);
        double unwrappedValue = doubleValue.doubleValue();
        System.out.println("Unwrapped value: " + unwrappedValue);
    }
}
