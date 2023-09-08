package module2.class15;

public class MathUtility5 {

    public static class Geometry {
        public static double calculateAreaOfRectangle(double length, double width) {
            return length * width;
        }

        public static double calculateCircumferenceOfCircle(double radius) {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        double length = 5.0;
        double width = 3.0;
        double area = Geometry.calculateAreaOfRectangle(length, width);
        System.out.println("Area of the rectangle: " + area);

        double radius = 4.0;
        double circumference = Geometry.calculateCircumferenceOfCircle(radius);
        System.out.println("Circumference of the circle: " + circumference);
    }
}
