package mylearning;

public class SigmoidFunction {

    public static double sigmoid(double z) {
        return 1 / (1 + Math.exp(-z));
    }

    public static double calculateBinaryCrossEntropyLoss(double y, double y_hat) {
        if (y == 1) {
            return -Math.log(y_hat);
        } else {
            return -Math.log(1 - y_hat);
        }
    }

    public static void main(String[] args) {
        double z = -100;
        double sigmoidValue = sigmoid(z);
        System.out.println("Sigmoid(" + z + ") = " + sigmoidValue);


        double y = 1.0;  // True label
        double y_hat = 0.2;  // Predicted probability

        double loss = calculateBinaryCrossEntropyLoss(y, y_hat);
        System.out.println("Binary Cross-Entropy Loss: " + loss);
    }
}
