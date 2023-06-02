package mylearning.finalmodel;


public class LinearRegressionSingleVariable {
    private double[] x;
    private double[] y;
    private double w;
    private double b;
    private double alpha;
    private int numIters;

    public LinearRegressionSingleVariable(double[] x, double[] y, double wInit, double bInit, double alpha, int numIters) {
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

    public double calculatePredictedY(double x) {
        return w * x + b;
    }

    public double[] computeGradient() {
        int m = x.length;
        double dj_dw = 0;
        double dj_db = 0;
        for (int i = 0; i < m; i++) {
            double predictedY = calculatePredictedY(x[i]);
            dj_dw += (predictedY - y[i]) * x[i];
            dj_db += predictedY - y[i];
        }
        dj_dw /= m;
        dj_db /= m;
        return new double[]{dj_dw, dj_db};
    }

    public void gradientDescent() {
        for (int i = 0; i < numIters; i++) {
            double[] gradient = computeGradient();
            double dj_dw = gradient[0];
            double dj_db = gradient[1];
            w = w - alpha * dj_dw;
            b = b - alpha * dj_db;
            double J = computeCost();
            if (i % (numIters / 10) == 0) {
                System.out.printf("Iteration %d: Cost %.2e dj_dw: %.3e dj_db: %.3e w: %.3e b: %.5e\n",
                        i, J, dj_dw, dj_db, w, b);
            }
        }
    }

    public double[] predict(double[] xTest) {
        int m = xTest.length;
        double[] yPredicted = new double[m];
        for (int i = 0; i < m; i++) {
            yPredicted[i] = calculatePredictedY(xTest[i]);
        }
        return yPredicted;
    }

    public static void main(String[] args) {
        // input data
        double[] xTrain = {1, 2};
        double[] yTrain = {300, 500};
        // initialize parameters
        double wInit = 0;
        double bInit = 0;
        // some gradient descent settings
        int iterations = 1000000;
        double tmpAlpha = 1.0e-3;

        LinearRegressionSingleVariable model = new LinearRegressionSingleVariable(xTrain, yTrain, wInit, bInit, tmpAlpha, iterations);
        model.gradientDescent();

        double[] xTest = {3, 4};
        double[] yTestPredicted = model.predict(xTest);

        System.out.printf("(w, b) found by gradient descent: (%.4f, %.4f)\n", model.w, model.b);


        System.out.println("Predicted y values:");
        for (int i = 0; i < xTest.length; i++)
        {
            System.out.printf("x = %.2f, y = %.2f\n", xTest[i], yTestPredicted[i]);
        }
    }
}