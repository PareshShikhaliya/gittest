package class22;

public class GreetingExample {
    public static String getGreeting(String condition) {
        var result = switch (condition) {
            case "Hi" -> {
                // Your code
                yield "Hello";
            }
            case "Bye" -> {
                // Your code
                yield "Goodbye";
            }
            default -> {
                // Your code
                yield "Unknown";
            }
        };

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getGreeting("Hi")); // Output: Hello
        System.out.println(getGreeting("Bye")); // Output: Goodbye
        System.out.println(getGreeting("Hello")); // Output: Unknown
    }
}
