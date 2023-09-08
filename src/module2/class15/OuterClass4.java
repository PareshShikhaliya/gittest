package module2.class15;

public class OuterClass4 {
    private int outerField = 10;

    // Static method in the outer class
    public static void staticMethod() {
        // You cannot create an object of the inner class inside a static method.
        // There's no instance of the outer class to pass to the inner class constructor.
        // InnerClass inner = new InnerClass(); // This will result in an error.
    }

    public class InnerClass {
        private int innerField;

        public InnerClass(int value) {
            this.innerField = value;
        }

        public void displayValues() {
            // You can access the outerField using OuterClass.this.outerField.
            System.out.println("OuterField: " + OuterClass4.this.outerField);
            System.out.println("InnerField: " + innerField);
        }
    }

    public static void main(String[] args) {
        OuterClass4 outer = new OuterClass4();

        // If the inner class is declared public, its objects can be created outside
        // the outer class, but you still need an instance of the outer class.
        OuterClass4.InnerClass inner = outer.new InnerClass(20);
        inner.displayValues();

        outer.outerMethod();
    }

    public void outerMethod() {
        System.out.println("OuterMethod: " + this.outerField);
        InnerClass inner = new InnerClass(30);
        inner.displayValues();
    }
}
