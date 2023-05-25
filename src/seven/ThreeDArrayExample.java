package seven;

public class ThreeDArrayExample {
    public static void main(String[] args) {
        // create a 3D array with hardcoded values
        int[] [][] threeDArray = {
                {
                        {1, 2},
                        {3, 4},
                        {5, 6},
                        {7, 8}
                },
                {
                        {9, 10},
                        {11, 12},
                        {13, 14},
                        {15, 16}
                },
                {
                        {17, 18},
                        {19, 20},
                        {21, 22},
                        {23, 24}
                }
        };

        // print the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
