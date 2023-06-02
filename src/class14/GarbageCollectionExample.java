package class14;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass(); //m1
        MyClass obj2 = new MyClass(); //m2

        // Assign obj1 to obj2
        obj2 = obj1;// obj2= m1  m2

        // Set obj1 to null
        obj1 = null;

        // Perform other operations...
    }
}

class MyClass {
    // Class members...
}
