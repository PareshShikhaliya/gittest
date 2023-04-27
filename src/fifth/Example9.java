package fifth;

import java.util.ArrayList;
import java.util.Scanner;

public class Example9
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target found at index " + i);
                break;
            }
        }
    }
}
