package module2.class15;

public class OuterClass6 {
    private int outerField = 10;
    public static int staticOuterField = 20;

    // Static Nested Class
    public static class StaticNestedClass {
        // Rule 1: Static Nested Class Cannot Access Non-Static Members
        public void displayValues() {
            System.out.println("StaticOuterField: " + staticOuterField);

            // Attempting to access outerField directly results in a compilation error.
            // System.out.println("OuterField: " + outerField);
        }

        // Rule 2: Static Nested Class Can Have Static Members
        public static void staticMethod() {
            System.out.println("StaticMethod called.");
        }
    }

    public void outerMethod() {
        // Creating an instance of the StaticNestedClass within the outer method.
        StaticNestedClass nestedObj = new StaticNestedClass();
        nestedObj.displayValues();
    }

    public static void main(String[] args) {
        OuterClass6 outer = new OuterClass6();

        // Accessing static members of StaticNestedClass
       // int value = StaticNestedClass.staticOuterField;
       // System.out.println("StaticOuterField: " + value);
        StaticNestedClass.staticMethod();

        // Rule 3: Static Nested Class is Instantiated Independently
        StaticNestedClass nestedObj = new StaticNestedClass();
        nestedObj.displayValues();

        // Rule 4: No Access to Outer Class Instance Members
        // Attempting to access outerField without an instance of OuterClass results in a compilation error.
        // System.out.println("OuterField: " + outer.outerField);
    }
}
/*
 Rule 1: Static Nested Class Cannot Access Non-Static Members of Outer Class Directly.
 Rule 2: Static Nested Class Can Contain Static Members.
 Rule 3: Static Nested Class is Instantiated Independently.
 Rule 4: No Implicit Access to Outer Class Instance Members.
 Rule 5: Static Nested Class Can Be Declared Private, Protected, or Package-Private.
 Rule 6: Outer Class Can Access Static Nested Class Members Directly.
 */