package class15;

public class IntegerExample {
    public static void main(String[] args) {
        int number = 42;

        // Convert the number to a hexadecimal string
        String hexString = Integer.toHexString(number);
        System.out.println("Hexadecimal representation of " + number + ": " + hexString);

        // Convert the number to a binary string
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + ": " + binaryString);

        // Convert the number to an octal string
        String octalString = Integer.toOctalString(number);
        System.out.println("Octal representation of " + number + ": " + octalString);

        // Wrap the number in an Integer object
        Integer wrappedInteger = Integer.valueOf(number);
        System.out.println("Wrapped Integer value: " + wrappedInteger);

        // Parse an integer from a string
        String numberString = "123";
        int parsedNumber = Integer.parseInt(numberString);
        System.out.println("Parsed integer value: " + parsedNumber);
    }
}
