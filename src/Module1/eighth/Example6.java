package Module1.eighth;

public class Example6 {

    public void print(int x) {
        System.out.println("Printing integer: " + x);
    }

    public void print(double x) {
        System.out.println("Printing double: " + x);
    }

    public void print(String x) {
        System.out.println("Printing string: " + x);
    }

    public static void main(String[] args) {
        Example6 obj = new Example6();

        obj.print(10);
        obj.print(10.10);
        obj.print("Hello World");
    }
}



