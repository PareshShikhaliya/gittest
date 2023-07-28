package Module1.class13;


public class Circle {
    private static final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        System.out.println("Area of circle1: " + circle1.getArea());    // Output: 78.53975
        System.out.println("Area of circle2: " + circle2.getArea());    // Output: 28.27431
    }
}

