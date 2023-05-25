package mylearning;

import java.util.ArrayList;
import java.util.List;

public class LinearRegressionSimplified {


    /*
    the function the  predictYHat calculates the predicted value y_hat given the input value x, weight w, and bias b.
     In other words, it calculates the predicted value for the input x using the linear equation y_hat = w * x + b,
      which is the hypothesis function for simple linear regression.
      calculates the predicted value y_hat given the input value x, weight w, and bias b.
       In other words, it calculates the predicted value for the input x using the linear equation
       y_hat = w * x + b,
       which is the hypothesis function for simple linear regression.
     */
    public static double predictYHat(double x, double w, double b)
    {
        return w * x + b;
    }
    /**
     * python code
     * def predict(x, w, b):
     *     """
     *     single predict using linear regression
     *     Args:
     *       x (ndarray): Shape (n,) example with multiple features
     *       w (ndarray): Shape (n,) model parameters
     *       b (scalar):             model parameter
     *
     *     Returns:
     *       p (scalar):  prediction
     *     """
     *     p = np.dot(x, w) + b
     *     return p
     */

    public static double predictYHatforMultipleFeature(double[] x, double[] w, double b) {
        double yHat = 0;
        yHat = dotProduct(x,w) +b;
        return yHat;
    }

    /*Yes, computeCost calculates the mean squared error (MSE), which is a measure of the difference between the predicted values
     and the actual values of the dependent variable.
      It computes the difference between the predicted values (computed using
      the linear regression model parameters w and b) and the actual values (y), squares the differences,
     sums them up, and then divides by twice the number of data points (2m) to get the average squared error per data point


     MSE = (1/2m) * Σ(i=1 to m) ( ŷ_i -y_i -)^2

        where:

        n is the number of samples
        y_i is the true value of the i-th sample
        ŷ_i is the predicted value of the i-th sample

    * */

    public static double computeCost(double[] x, double[] y, double w, double b) {
        int m = x.length;
        double cost = 0;
        for (int i = 0; i < m; i++) {
            cost += Math.pow(predictYHat(x[i], w, b) - y[i], 2);
        }
        double totalCost = 1.0 / (2 * m) * cost;
        return totalCost;
    }
    /*
            def compute_cost(X, y, w, b):
        """
        compute cost
        Args:
          X (ndarray (m,n)): Data, m examples with n features
          y (ndarray (m,)) : target values
          w (ndarray (n,)) : model parameters
          b (scalar)       : model parameter

        Returns:
          cost (scalar): cost
        """
        m = X.shape[0]
        cost = 0.0
        for i in range(m):
            f_wb_i = np.dot(X[i], w) + b           #(n,)(n,) = scalar (see np.dot)
            cost = cost + (f_wb_i - y[i])**2       #scalar
        cost = cost / (2 * m)                      #scalar
        return cost


     */
    public static double computeCostforMulti(double[][] X, double[] y, double[] w, double b) {
        int m = X.length;
        double cost = 0.0;
        for (int i = 0; i < m; i++) {
            cost += Math.pow((predictYHatforMultipleFeature(X[i],w,b) - y[i]), 2);
        }
        double totalCost = 1.0 / (2 * m) * cost;
        return totalCost;
    }

    private static double dotProduct(double[] w, double[] X) {
        double f_wb_i = 0.0;
        for (int j = 0; j < w.length; j++) {
            f_wb_i += X[j] * w[j];
        }
        return f_wb_i;
    }


    public static double dj_dw(double x, double y, double w, double b) {
        return (predictYHat(x, w, b) - y) * x;
    }

    public static double dj_db(double x, double y, double w, double b) {
        return predictYHat(x, w, b) - y;
    }



    /*
        dw = (1/m) * sum((y_hat - y) * x)
        db = (1/m) * sum(y_hat - y)
     */

    public static double[] computeGradient(double[] x, double[] y, double w, double b) {
        int m = x.length;
        double dj_dw_sum = 0;
        double dj_db_sum = 0;
        for (int i = 0; i < m; i++) {
            dj_dw_sum += dj_dw(x[i], y[i], w, b);
            dj_db_sum += dj_db(x[i], y[i], w, b);
        }
        dj_dw_sum /= m;
        dj_db_sum /= m;
        double[] gradient = {dj_dw_sum, dj_db_sum};
        return gradient;
    }


    public static Gradient computeGradientForMultipleVariable(double[][] X, double[] y, double[] w, double b) {
        int m = X.length;
        int n = X[0].length;
        double[] dj_dw = new double[n];
        double dj_db = 0;

        for (int i = 0; i < m; i++) {

            ;
            double err = predictYHatforMultipleFeature(X[i],w,b) - y[i];
            for (int j = 0; j < n; j++) {
                dj_dw[j] += err * X[i][j];
            }
            dj_db += err;
        }
        for (int j = 0; j < n; j++) {
            dj_dw[j] /= m;
        }
        dj_db /= m;

        return new Gradient(dj_db, dj_dw);
    }


    /*
    For linear regression, the update rule for each parameter w and b becomes:

    w := w - α * dj_dw

    b := b - α * dj_db

    where:

    dj_dw is the partial derivative of the cost function J with respect to w
    dj_db is the partial derivative of the cost function J with respect to b
     */
    public static List<Object> gradientDescent(double[] x, double[] y, double w, double b, double alpha, int numIters) {
        List<Object> result = new ArrayList<>();
        List<Double> JHistory = new ArrayList<>();
        List<double[]> pHistory = new ArrayList<>();
        double[] gradient = new double[2];
        double breakpoint = 0;
        for (int i = 0; i < numIters; i++) {
            gradient = computeGradient(x, y, w, b);
            double dj_dw = gradient[0];
            double dj_db = gradient[1];
            b = b - alpha * dj_db;
            w = w - alpha * dj_dw;
            double J = computeCost(x, y, w, b);
            if(J==breakpoint)
            {
                //break;
            }
            else
            {
                breakpoint=J;
            }
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
        double[] xTrain = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] yTrain = {50, 60, 70, 80, 90, 100, 110, 120, 130, 140};

        // initialize parameters
        double wInit = 0;
        double bInit = 0;

        // some gradient descent settings
        int iterations = 100000;
        double tmpAlpha = 0.01;

        // run gradient descent
        List<Object> result = gradientDescent(xTrain, yTrain, wInit, bInit, tmpAlpha, iterations);
        double wFinal = (double) result.get(0);
        double bFinal = (double) result.get(1);
        System.out.printf("(w, b) found by gradient descent: (%.4f, %.4f)\n", wFinal, bFinal);

        // make predictions using the model
        double xTest = 11;
        double yTest = wFinal * xTest + bFinal;
        System.out.printf("Prediction for x=%.1f: %.2f\n", xTest, yTest);
    }
}
 class Gradient {
    public double dj_db;
    public double[] dj_dw;

    public Gradient(double dj_db, double[] dj_dw) {
        this.dj_db = dj_db;
        this.dj_dw = dj_dw;
    }
}
