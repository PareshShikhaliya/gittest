package class14;

class MyClass2 {
    @Override
    protected void finalize() {
        System.out.println("Garbage collection triggered for MyClass2 object");
    }
}

public class GarbageCollectionExample2 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj = null; // Setting the reference to null
        System.gc(); // Suggesting the garbage collector to run
    }
}
