package Module1.seven;

public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] myArray = new int[3][4];

        // Initialize the elements of the array
        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;
        myArray[0][3] = 4;

        myArray[1][0] = 5;
        myArray[1][1] = 6;
        myArray[1][2] = 7;
        myArray[1][3] = 8;

        myArray[2][0] = 9;
        myArray[2][1] = 10;
        myArray[2][2] = 11;
        myArray[2][3] = 12;

        // Print the contents of the array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("processing row= "+i);
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.println("processing col= "+j);
                //System.out.print(myArray[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
