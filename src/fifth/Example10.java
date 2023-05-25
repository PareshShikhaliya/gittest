package fifth;

public class Example10
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue; // skip even numbers
            }
            sum += numbers[i];
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}

