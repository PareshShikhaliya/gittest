package Module1.class14;
class MyClass3 {
    private String name;
    private MyClass3 other;

    public MyClass3(String name) {
        this.name = name;
        System.out.println("Created object: " + name);
    }

    public void setOther(MyClass3 other) {
        this.other = other;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collection triggered for object: " + name);
    }
}

public class GarbageCollectionExample3 {
    public static void main(String[] args) {
        // Scenario 1: Object goes out of scope
        {
            MyClass3 obj1 = new MyClass3("Object 1");
        } // obj1 is out of scope here

        // Scenario 2: Object reference is reassigned
        MyClass3 obj2 = new MyClass3("Object 2");
        MyClass3 obj3 = new MyClass3("Object 3");

        obj2 = obj3; // obj2 no longer references "Object 2"
        obj3 = null; // obj3 no longer references "Object 3"

        // Scenario 3: Object's strong references are removed
        MyClass3 obj4 = new MyClass3("Object 4");
        MyClass3 obj5 = new MyClass3("Object 5");

        obj4 = null; // obj4 no longer references "Object 4"
        obj5 = null; // obj5 no longer references "Object 5"

        // Scenario 4: Circular references
        MyClass3 obj6 = new MyClass3("Object 6");
        MyClass3 obj7 = new MyClass3("Object 7");

        obj6.setOther(obj7);
        obj7.setOther(obj6);

        obj6 = null; // obj6 no longer references "Object 6"
        obj7 = null; // obj7 no longer references "Object 7"

        // Circular reference between obj8 and obj9
        MyClass3 obj8 = new MyClass3("Object 8");
        MyClass3 obj9 = new MyClass3("Object 9");

        obj8.setOther(obj9);
        obj9.setOther(obj8);

        obj8 = null; // obj8 and obj9 are eligible for garbage collection
        obj9 = null;

        // Scenario 5: System-triggered garbage collection
        for (int i = 0; i < 1000000; i++) {
            new MyClass3("Temp Object " + i);
        }

        System.gc(); // Suggesting garbage collection
    }
}
