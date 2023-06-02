package mylearning.finalmodel;

import java.util.Arrays;
/*
* The code you provided looks fine in terms of logic and calculation. Here's a breakdown of the important methods and their functionalities:

computeCost(): Computes the cost function, which measures the error between the predicted values and the actual values.

calculatePredictedY(double[] features): Calculates the predicted value of y based on the input features (x) and the current weights (w) and bias (b).

dotProduct(double[] vectorA, double[] vectorB): Computes the dot product between two vectors. This method is used within calculatePredictedY() to perform the dot product between w and features.

computeGradient(): Computes the gradient of the cost function with respect to the weights (w) and bias (b), using the predicted values and the actual values.

gradientDescent(): Performs gradient descent optimization to update the weights (w) and bias (b) iteratively based on the computed gradient. It also prints the current cost and parameter values during the iterations.

test(double[][] xTest): Predicts the output values for new input data (xTest) using the learned weights and bias.

The main method sets up the necessary data and hyperparameters, creates an instance of the LinearRegressionMultipleVariables class, and calls the gradientDescent and test methods to train the model and make predictions.

Overall, the code appears to be correctly implemented for linear regression with multiple variables.*/
public class LinearRegressionMultipleVariables {
    private double[][] x;
    private double[] y;
    private double[] w;
    private double b;
    private double alpha;
    private int numIters;

    public LinearRegressionMultipleVariables(double[][] x, double[] y, double[] wInit, double bInit, double alpha, int numIters) {
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

    public double dotProduct(double[] w, double[] features) {
        if (w.length != x.length) {
            throw new IllegalArgumentException("Vector sizes do not match");
        }
        double sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i] * features[i];
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
            double dj_db = predictedY - y[i];
            gradient[0] += dj_db;
            for (int j = 0; j < n; j++) {
                gradient[j + 1] += dj_db * features[j];
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
        double[][] xTrain = {{1, 2}, {2, 3},{3,4}};
        double[] yTrain = {300, 500,700};
        // initialize parameters
        double[] wInit = {0, 0};
        double bInit = 0;
        // some gradient descent settings
        int iterations = 1000000;
        double tmpAlpha = 1.0e-3;

        LinearRegressionMultipleVariables model = new LinearRegressionMultipleVariables(xTrain, yTrain, wInit, bInit, tmpAlpha, iterations);
        model.gradientDescent();

        double[][] xTest = {{3, 4}, {4, 5}};
        double[] yTestPredicted = model.test(xTest);

        System.out.printf("(w, b) found by gradient descent: (%s, %.4f)\n", Arrays.toString(model.w), model.b);

        System.out.println("Predicted y values:");
        for (int i = 0; i < xTest.length; i++) {
            System.out.printf("x = %s, y = %.2f\n", Arrays.toString(xTest[i]), yTestPredicted[i]);
        }
    }
}

