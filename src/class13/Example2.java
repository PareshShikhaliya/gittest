package class13;


public class Example2 {
    private static int staticVariable = 10;
    private int instanceVariable = 20;

    public static void main(String[] args)
    {
        Example2 obj1 = new Example2();
        Example2 obj2 = new Example2();

        Example2.staticVariable = 30;
        obj1.instanceVariable = 40;

        System.out.println("Static variable - obj1: " + obj1.staticVariable);    // Output: 30
        System.out.println("Static variable - obj2: " + obj2.staticVariable);    // Output: 30

        System.out.println("Instance variable - obj1: " + obj1.instanceVariable);    // Output: 40
        System.out.println("Instance variable - obj2: " + obj2.instanceVariable);    // Output: 20
    }
}

