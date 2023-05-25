package mylearning;

import java.util.ArrayList;
import java.util.List;

public class LinearRegression {

    public static double computeCost(double[] x, double[] y, double w, double b) {
        int m = x.length;
        double cost = 0;
        for (int i = 0; i < m; i++) {
            double f_wb = w * x[i] + b;
            cost += Math.pow(f_wb - y[i], 2);
        }
        double totalCost = 1.0 / (2 * m) * cost;
        return totalCost;
    }

    public static double[] computeGradient(double[] x, double[] y, double w, double b) {
        int m = x.length;
        double dj_dw = 0;
        double dj_db = 0;
        for (int i = 0; i < m; i++) {
            double f_wb = w * x[i] + b;
            dj_dw += (f_wb - y[i]) * x[i];
            dj_db += f_wb - y[i];
        }
        dj_dw /= m;
        dj_db /= m;
        double[] gradient = {dj_dw, dj_db};
        return gradient;
    }

    public static List<Object> gradientDescent(double[] x, double[] y, double w, double b, double alpha, int numIters) {
        List<Object> result = new ArrayList<>();
        List<Double> JHistory = new ArrayList<>();
        List<double[]> pHistory = new ArrayList<>();
        double[] gradient = new double[2];
        for (int i = 0; i < numIters; i++) {
            gradient = computeGradient(x, y, w, b);
            double dj_dw = gradient[0];
            double dj_db = gradient[1];
            b = b - alpha * dj_db;
            w = w - alpha * dj_dw;
            double J = computeCost(x, y, w, b);
            JHistory.add(J);
            double[] p = {w, b};
            pHistory.add(p);
            if (i % (numIters / 10) == 0) {
                System.out.printf("Iteration %d: Cost %.2e dj_dw: %.3e dj_db: %.3e w: %.3e b: %.5e\n",
                        i, J, dj_dw, dj_db, w, b);
            }
        }
        result.add(w);
        result.add(b);
        result.add(JHistory);
        result.add(pHistory);
        return result;
    }

    public static void main(String[] args) {
        // input data
        double[] xTrain = {1, 2};
        double[] yTrain = {300,500};
        // initialize parameters
        double wInit = 0;
        double bInit = 0;
        // some gradient descent settings
        int iterations = 1000000;
        double tmpAlpha = 1.0e-3;
        // run gradient descent
        List<Object> result = gradientDescent(xTrain, yTrain, wInit, bInit, tmpAlpha, iterations);
        double wFinal = (double)result.get(0);
        double bFinal = (double)result.get(1);
        System.out.printf("(w, b) found by gradient descent: (%.4f, %.4f)\n", wFinal, bFinal);
    }
}
