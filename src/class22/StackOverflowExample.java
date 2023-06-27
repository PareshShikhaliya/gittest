package class22;

public class StackOverflowExample {
    public static void main(String[] args) {
        recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
