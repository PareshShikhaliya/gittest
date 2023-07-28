package Module1.seven;

public class DiagonalMatrixExample {
    public static void main(String[] args) {
        // Create a 3x3 matrix
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        // Find the diagonal elements from top-left to bottom-right
        int[] diagonalTopLeft = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            diagonalTopLeft[i] = myArray[i][i];
        }

        // Find the diagonal elements from top-right to bottom-left
        int[] diagonalTopRight = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            diagonalTopRight[i] = myArray[i][myArray.length -1-i];
        }

        // Print the diagonal elements
        System.out.println("Diagonal from top-left to bottom-right:");
        for (int i = 0; i < diagonalTopLeft.length; i++) {
            System.out.print(diagonalTopLeft[i] + " ");
        }

        System.out.println("\nDiagonal from top-right to bottom-left:");
        for (int i = 0; i < diagonalTopRight.length; i++) {
            System.out.print(diagonalTopRight[i] + " ");
        }
    }


}
