package Module1.eighth;

public class Example1 {
    public static void main(String[] args) {
        int a = 5;
        float b = 10;

        float result = addInteger1(b,a);

        System.out.println("The sum of " + a + " and " + b + " is " + result);
    }
    // 1 number of parameter
    // 2 Type of parameter
    // 3 order of the parameter
    // return type should be same as the result type


    // user-defined method that takes two integer parameters and returns their sum
    private static float addInteger1(float x, int y)
    {
        float result = x + y;
        return result;
    }

    public static float addInteger2(float x, int y)
    {
        float result = x + y;
        return result;
    }

}

