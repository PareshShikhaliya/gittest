package mylearning;


import java.util.Arrays;

public class PyToJava {
    public static void main(String[] args) {
        double[][] X = {{0.5, 1.5}, {1, 1}, {1.5, 0.5}, {3, 0.5}, {2, 2}, {1, 2.5}};
        int[] y = {0, 0, 0, 1, 1, 1};

        double[][] reshapedY = new double[y.length][1];
        for (int i = 0; i < y.length; i++) {
            reshapedY[i][0] = y[i];
        }

        System.out.println("X: " + Arrays.deepToString(X));
        System.out.println("y: " + Arrays.deepToString(reshapedY));
    }
}

