package Module1.ninth;


public class Example3 {
    public static void main(String[] args) {
        final double METERS_TO_MILES = 0.000621371; // declaring conversion rate as a constant

        double distanceInMeters = 5000.0;
        double distanceInMiles = distanceInMeters * METERS_TO_MILES; // converting distance to miles

        System.out.println("The distance is: " + distanceInMiles + " miles"); // printing the result
    }
}


