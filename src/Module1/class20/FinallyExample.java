package Module1.class20;

public class FinallyExample {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("result="+result);
    }

    public static int divide(int num1, int num2) {
        int result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        return result;
    }
}
