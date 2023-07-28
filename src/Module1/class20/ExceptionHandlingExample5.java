package Module1.class20;



public class ExceptionHandlingExample5 {
    public static void main(String[] args) {
        divide(10, 0);
    }

    public static void divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = dividend / divisor;
        System.out.println("Result: " + result);
    }
}

