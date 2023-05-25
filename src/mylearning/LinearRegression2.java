package mylearning;

import java.util.ArrayList;
import java.util.List;

public class LinearRegression2 {
    public static void main(String[] args) {
        // input datadd
        double[] xTrain = {1, 2, 3, 4, 5};
        double[] yTrain = {2, 4, 6, 8, 10};

        // initialize parameters
        double wInit = 0;
        double bInit = 0;

        // some gradient descent settings
        int iterations = 100;
        double tmpAlpha = 1.0e-2;

        // run gradient descent
        List<Object> result = gradientDescent(xTrain, yTrain, wInit, bInit, tmpAlpha, iterations);
        double wFinal = (double)result.get(0);
        double bFinal = (double)result.get(1);

        System.out.printf("(w, b) found by gradient descent: (%.4f, %.4f)%n", wFinal, bFinal);

        // predict new data point
        double xNew = 6.0;
        double yHat = wFinal * xNew + bFinal;

        System.out.printf("Prediction for x = %.1f: %.4f", xNew, yHat);
    }

    public static List<Object> gradientDescent(double[] x, double[] y, double w, double b, double alpha, int iterations) {
        List<Double> jHist = new ArrayList<Double>();
        List<Double> pHist = new ArrayList<Double>();

        for (int i = 0; i < iterations; i++) {
            double[] yHat = new double[x.length];
            double error = 0;
            double wGradient = 0;
            double bGradient = 0;

            for (int j = 0; j < x.length; j++) {
                yHat[j] = w * x[j] + b;
                error += Math.pow((y[j] - yHat[j]), 2);
                wGradient += 2 * x[j] * (yHat[j] - y[j]);
                bGradient += 2 * (yHat[j] - y[j]);
            }

            jHist.add(error);
            pHist.add(w);

            w -= alpha * wGradient / x.length;
            b -= alpha * bGradient / x.length;
        }

        List<Object> result = new ArrayList<Object>();
        result.add(w);
        result.add(b);
        result.add(jHist);
        result.add(pHist);

        return result;
    }
}
