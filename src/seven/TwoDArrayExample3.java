package seven;

public class TwoDArrayExample3 {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6,7,8},
                {7, 8, 9}
        };

        // Add 100 to each element
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] += 100;
            }
        }

        // Print the updated matrix
        System.out.println("Updated matrix:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
