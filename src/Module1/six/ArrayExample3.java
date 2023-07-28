package Module1.six;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] myArray = {5, 10, 15, 20, 25};

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }

        double average = (double) sum / myArray.length;

        System.out.println("The average of the array elements is: " + average);
    }
}
