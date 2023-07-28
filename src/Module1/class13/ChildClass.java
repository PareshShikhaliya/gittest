package Module1.class13;
 class ParentClass {
    static {
        System.out.println("Static block of ParentClass");
    }

    static int parentStaticField = initializeParentStaticField();

    {
        System.out.println("Initialization block of ParentClass");
    }

    int parentNonStaticField = initializeParentNonStaticField();

    public ParentClass() {
        System.out.println("Constructor of ParentClass");
    }

    static int initializeParentStaticField() {
        System.out.println("Initializing parentStaticField");
        return 10;
    }

    int initializeParentNonStaticField() {
        System.out.println("Initializing parentNonStaticField");
        return 20;
    }
}

public class ChildClass extends ParentClass {
    static {
        System.out.println("Static block of ChildClass");
    }

    static int childStaticField = initializeChildStaticField();

    {
        System.out.println("Initialization block of ChildClass");
    }

    int childNonStaticField = initializeChildNonStaticField();

    public ChildClass() {
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
        ChildClass child = new ChildClass();
    }
}
