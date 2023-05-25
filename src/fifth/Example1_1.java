package fifth;

public class Example1_1 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of the first " + n + " positive integers is: " + sum);
    }
}

