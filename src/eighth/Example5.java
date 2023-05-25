package eighth;

public class Example5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double c = 2.5;
        double d = 3.5;

        System.out.println(add(a, b)); // calls the add(int, int) method
        System.out.println(add(c, d)); // calls the add(double, double) method
        System.out.println(add(a, b, c)); // calls the add(int, int, double) method
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, int b, double c) {
        return a + b + c;
    }
}


