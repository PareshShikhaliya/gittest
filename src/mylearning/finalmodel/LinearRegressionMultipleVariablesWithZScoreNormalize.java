package mylearning.finalmodel;

import java.util.Arrays;

public class LinearRegressionMultipleVariablesWithZScoreNormalize {
    private double[][] x;
    private double[] y;
    private double[] w;
    private double b;
    private double alpha;
    private int numIters;

    public LinearRegressionMultipleVariablesWithZScoreNormalize(double[][] x, double[] y, double[] wInit, double bInit, double alpha, int numIters) {
        this.x = x;
        this.y = y;
        this.w = wInit;
        this.b = bInit;
        this.alpha = alpha;
        this.numIters = numIters;
    }

    public double computeCost() {
        int m = x.length;
        double cost = 0;
        for (int i = 0; i < m; i++) {
            double predictedY = calculatePredictedY(x[i]);
            cost += Math.pow(predictedY - y[i], 2);
        }
        double totalCost = 1.0 / (2 * m) * cost;
        return totalCost;
    }

    public double calculatePredictedY(double[] features) {
        return dotProduct(w, features) + b;
    }

    public double dotProduct(double[] vectorA, double[] vectorB) {
        if (vectorA.length != vectorB.length) {
            throw new IllegalArgumentException("Vector sizes do not match");
        }
        double sum = 0;
        for (int i = 0; i < vectorA.length; i++) {
            sum += vectorA[i] * vectorB[i];
        }
        return sum;
    }

    public double[] computeGradient() {
        int m = x.length;
        int n = x[0].length;
        double[] gradient = new double[n + 1];
        for (int i = 0; i < m; i++) {
            double[] features = x[i];
            double predictedY = calculatePredictedY(features);
            double error = predictedY - y[i];
            gradient[0] += error;
            for (int j = 0; j < n; j++) {
                gradient[j + 1] += error * features[j];
            }
        }
        for (int i = 0; i < gradient.length; i++) {
            gradient[i] /= m;
        }
        return gradient;
    }

    public void gradientDescent() {
        int n = x[0].length;
        for (int i = 0; i < numIters; i++) {
            double[] gradient = computeGradient();
            b = b - alpha * gradient[0];
            for (int j = 0; j < n; j++) {
                w[j] = w[j] - alpha * gradient[j + 1];
            }
            double J = computeCost();
            if (i % (numIters / 10) == 0) {
                System.out.printf("Iteration %d: Cost %.2e w: %s b: %.5e\n",
                        i, J, Arrays.toString(w), b);
            }
        }
    }

    public double[] test(double[][] xTest) {
        int m = xTest.length;
        int n = xTest[0].length;
        double[] yPredicted = new double[m];
        for (int i = 0; i < m; i++) {
            double[] features = xTest[i];
            yPredicted[i] = calculatePredictedY(features);
        }
        return yPredicted;
    }

    public static void main(String[] args) {
        // input data
        double[][] xTrain = {{1, 2}, {2, 3}};
        double[] yTrain = {300, 500};

        // Z-score normalization
        double[] xMean = calculateMean(xTrain);
        double[] xStdDev = calculateStdDev(xTrain, xMean);
        double[][] xNormalized = normalizeFeatures(xTrain, xMean, xStdDev);

        // initialize parameters
        double[] wInit = {0, 0};
        double bInit = 0;
        // some gradient descent settings
        int iterations = 1000000;
        double tmpAlpha = 1.0e-3;

        LinearRegressionMultipleVariablesWithZScoreNormalize model = new LinearRegressionMultipleVariablesWithZScoreNormalize(xNormalized, yTrain, wInit, bInit, tmpAlpha, iterations);
        model.gradientDescent();

        double[][] xTest = {{3, 4}, {4, 5}};
        double[][] xTestNormalized = normalizeFeatures(xTest, xMean, xStdDev);
        double[] yTestPredicted = model.test(xTestNormalized);

        System.out.printf("(w, b) found by gradient descent: (%s, %.4f)\n", Arrays.toString(model.w), model.b);

        System.out.println("Predicted y values:");
        for (int i = 0; i < xTest.length; i++) {
            System.out.printf("x = %s, y = %.2f\n", Arrays.toString(xTest[i]), yTestPredicted[i]);
        }
    }

    private static double[] calculateMean(double[][] features) {
        int m = features.length;
        int n = features[0].length;
        double[] mean = new double[n];
        for (int j = 0; j < n; j++) {
            double sum = 0;
            for (int i = 0; i < m; i++) {
                sum += features[i][j];
            }
            mean[j] = sum / m;
        }
        return mean;
    }

    private static double[] calculateStdDev(double[][] features, double[] mean) {
        int m = features.length;
        int n = features[0].length;
        double[] stdDev = new double[n];
        for (int j = 0; j < n; j++) {
            double sum = 0;
            for (int i = 0; i < m; i++) {
                sum += Math.pow(features[i][j] - mean[j], 2);
            }
            stdDev[j] = Math.sqrt(sum / m);
        }
        return stdDev;
    }

    private static double[][] normalizeFeatures(double[][] features, double[] mean, double[] stdDev) {
        int m = features.length;
        int n = features[0].length;
        double[][] normalizedFeatures = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                double normalizedValue = (features[i][j] - mean[j]) / stdDev[j];
                normalizedFeatures[i][j] = normalizedValue;
            }
        }
        return normalizedFeatures;
    }
}
