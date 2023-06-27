package class20;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ThrowVsThrowsExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        }
    }

    public static void method1() throws MyException {
        // This method declares that it may throw a MyException using the "throws" keyword
        method2();
    }

    public static void method2() throws MyException {
        // This method also declares that it may throw a MyException using the "throws" keyword
        int x = 10;
        if (x > 5) {
            // This line throws a MyException using the "throw" keyword
            throw new MyException("x is greater than 5");
        }
    }
}
