package Module1.eighth;

public class Example2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b); // calling user-defined method
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    // user-defined method that takes two integer parameters and returns their sum
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}

