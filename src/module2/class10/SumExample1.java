package module2.class10;

public class SumExample1 {
    // Recursive sum calculation



    public static int sumRecursive(int n)
    {
        if (n == 0) {
            return 0;
        }
        else {
            return  n + sumRecursive(n - 1);
        }
    }

    /*
    Calling sumRecursive(0) result = 0  : deleted
    Calling sumRecursive(1) result  =1  : deleted
    Calling sumRecursive(2) result = 3   : deleted
    Calling sumRecursive(3) result = 6  : deleted
    Calling sumRecursive(4)
    Calling sumRecursive(5)

     */




    // Iterative sum calculation
    public static int sumIterative(int n)
    {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5;

        // Using recursive method
       // 5 + 4 + +3 + 2 + 1;
        int recursiveSum = sumRecursive(num);
        System.out.println("Recursive: The sum of numbers from 1 to " + num + " is " + recursiveSum);
    }
}
