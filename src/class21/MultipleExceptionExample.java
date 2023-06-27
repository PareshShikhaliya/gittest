package class21;

public class MultipleExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4] / 0;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
        //crete jira
        //send email {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
