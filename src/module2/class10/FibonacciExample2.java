package module2.class10;

public class FibonacciExample2 {
    public static int fibonacciRecursive(int n) {
        if (n < 2) {
            return n;
        } else {
            System.out.println(" fibonacciRecursive("+(n - 1)+") + fibonacciRecursive("+(n - 2));
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
    public static void main(String[] args) {
        int num = 6;

        System.out.print(fibonacciRecursive(num));
    }
}

//1 1 2 3 5 8


                            /*

                                                    Calling fibonacciRecursive(5)
                                                                   !














                             */