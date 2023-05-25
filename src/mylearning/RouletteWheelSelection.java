package mylearning;

import java.util.Random;

public class RouletteWheelSelection {
    private static Random random = new Random();
    private static double[] probabilities = {0.2, 0.3, 0.1, 0.4}; // Example probabilities

    public static int spinRouletteWheel() {
        double spin = random.nextDouble(); // Generate random number between 0 and 1
        double cumulativeProbability = 0.0;

        for (int i = 0; i < probabilities.length; i++) {
            cumulativeProbability += probabilities[i];
            if (spin <= cumulativeProbability) {
                return i; // Return the index of the chosen individual
            }
        }

        // In case of rounding errors or edge cases, return the last individual
        return probabilities.length - 1;
    }

    public static void main(String[] args) {
        int chosenIndividual = spinRouletteWheel();
        System.out.println("Chosen Individual: " + chosenIndividual);
    }
}
