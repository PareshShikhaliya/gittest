package class13;

public class ChildClass2 {
    static {
        System.out.println("Static block of ChildClass");
    }

    static int childStaticField = initializeChildStaticField();

    {
        System.out.println("Initialization block of ChildClass");
    }

    int childNonStaticField = initializeChildNonStaticField();

    public ChildClass2() {
        System.out.println("Constructor of ChildClass");
    }

    static int initializeChildStaticField() {
        System.out.println("Initializing childStaticField");
        return 30;
    }

    int initializeChildNonStaticField() {
        System.out.println("Initializing childNonStaticField");
        return 40;
    }

    public static void main(String[] args) {
        ChildClass2 child = new ChildClass2();
    }
}
