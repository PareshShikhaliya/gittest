package module2.class15;

public class OuterClass1 {

    private int outerField = 10;

    // Inner class definition
    public class InnerClass
    {
        // Inner class can access the outer class's members
        public void innerMethod() {
            System.out.println("InnerClass: Accessing outerField = " + outerField);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass1 outerObj = new OuterClass1();

        // Create an instance of the inner class
        OuterClass1.InnerClass innerObj = outerObj.new InnerClass();

        // Call methods of the inner class
        innerObj.innerMethod();
    }
}
